package Streams1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import  java.io.File;

public class PrtStream {
    public static void main(String[] args) {
        try {
            PrintStream out = new PrintStream("example8.txt");
//            PrintStream out = new PrintStream(new File("example8.txt"));

            int var1 = 10;
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
    }
}
