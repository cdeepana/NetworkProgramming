package Streams1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStream2 {
    public static void main(String[] args){
        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example5.txt"));
            InputStreamReader in = new InputStreamReader(new FileInputStream("example5.txt"));

            out.write("reading Using InputStreamReader");

            out.flush();
            out.close();

            int data = in.read();
            while (data != -1)
            {
                System.out.print((char)data);
                data = in.read();
            }

        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
