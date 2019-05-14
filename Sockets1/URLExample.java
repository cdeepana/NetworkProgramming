package Sockets1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLExample {
    public static void main(String[] args) throws Exception
    {
        URL url = new URL("https://ikman.lk/en/ad/micro-panda-geely-2014-for-sale-ampara");


        URLConnection myURL = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(myURL.getInputStream()));
        String inputLine;
//        String pattern = "<span id=\"yfs_184_orcl\">(.+?)</span>";
//        String pattern = "<h1 itemprop=\"name\">(.+?)</h1>";
        String pattern = "<div class=\"item-contact-more is-showable\"><ul><li class=\"clearfix\"><span class=\"h3\">(.+?)</span></li></ul></div>";



        Pattern r = Pattern.compile(pattern);
        while ((inputLine = in.readLine()) != null)
        {
//            System.out.println(inputLine);
            if (inputLine.contains("h3"))

            {
                Matcher m = r.matcher(inputLine);
                if (m.find())
                {
                    System.out.println(m.group(1));

                }
            }
        }
        in.close();
    }
}
