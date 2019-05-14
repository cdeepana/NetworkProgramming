package Sockets1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ping2 {
    public static void main(String[] args)
    {
        try
        {
            String hostAddress = "192.168.1.123";
//            String hostAddress = "google.lk";
            InetAddress host = InetAddress.getByName(hostAddress);
            System.out.println(host.isReachable(1000));

            Process p = Runtime.getRuntime().exec("ping " +hostAddress);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String commandOutput1 = "";

            boolean isReachable = true;

            while ((commandOutput1 = inputStream.readLine()) != null)
            {
//                System.out.println("hiii");
//                System.out.println(commandOutput1);

//                if(commandOutput1.contains("Destination host unreachable."))
              if(commandOutput1.contains("Request timed out."))
                {
                    isReachable = false;
                    break;
                }




            }


            if (isReachable)
            {
                System.out.println("Host is reachable!");
            }
            else
            {
                System.out.println("Host is not reachable!");
            }




        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

}
