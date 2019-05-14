package Sockets1;

//https://commons.apache.org/proper/commons-validator/download_validator.cgi

//import org.apache.commons.validator.routines.InetAddressValidator;

//valid IP address

//192.168.0.12
//10.10.10.10
//86.123.6.230

//invalid ip addresses

//192.168.0.321
//10.10.10.10.10
//232.0.0.ac

public class ValidateIP {

    public static void main(String [] args)
    {
        System.out.println( validateIpAddress());


    }

    public static boolean validateIpAddress()
    {
        String ipAddress = "192.168.0.123";
        String[] numbers = ipAddress.split("\\.");
        if (numbers.length != 4)
        {
            return false;
        }

        for(String str: numbers)
        {
            int i = Integer.parseInt(str);
            if((i<0) || (i>255))
            {
                return false;
            }
        }
        return true;
    }

}