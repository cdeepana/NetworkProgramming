package Streams1;

import  java.io.*;

public class OutStream {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutput = new FileOutputStream("example2.txt", true);
//            WHEN USING TRUE SECOND APPEND DATA to prevoius. without "true" this txt file will overwrite
//            when FALSE keword to overwrite
//primary method one character
            char H = 'H';
            fileOutput.write((char)H);
//second method string
            String string = "Hello Java Network Programming";

            fileOutput.write(string.getBytes());
            fileOutput.close();


        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }
}

