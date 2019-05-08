package Streams1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStream {
    public static void main(String[] args){
        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"));
//            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"), "ASCII");  when use ASCII with these parsing it only accept acsii characters. not any sinhala ,janapese font
            InputStreamReader in = new InputStreamReader(new FileInputStream("example4.txt"));

//            System.out.println(out.getEncoding());
//            out.write("ආයුබෝවන්!"); sinahala font can be used bcs UTF8. we can use above method to find it?
            out.write("Hello characterStream!");

//            out.flush();  wh en flus method it does not close the stream but ,
//              using close() method is close the stream and can not write further with particular stream.
            out.flush();
//            out.write("another string to stream");
            out.close();
//            actually close method call flush()
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
