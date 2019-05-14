package Sockets1;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class InetAddressExample {
    public static void main(String[] args)
    {
        try
        {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            InetAddress address1 = InetAddress.getByName("google.com");
            System.out.println(address1.getHostAddress());
            System.out.println(address1.getHostName());
//            Socket socket = new Socket(address, 9090);
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }


    }
}
