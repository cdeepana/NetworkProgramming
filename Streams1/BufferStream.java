package Streams1;
import  java.io.*;


public class BufferStream {
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example6.txt"), 1024);
//            1024 using to define buffer size. actually it have default siz but can change
            BufferedWriter writer = new BufferedWriter(new FileWriter("example7.txt"));
//           filereader & filewriter are read and write instead of only raw bite. not different from output input filestreams

            String line = null;

            while ((line = reader.readLine()) != null)
            {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }
}
