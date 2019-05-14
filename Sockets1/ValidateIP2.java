package Sockets1;

import org.apache.commons.validator.routines.InetAddressValidator;

public class ValidateIP2 {

//valid IP address

//192.168.0.12
//10.10.10.10
//86.123.6.230

//invalid ip addresses

//192.168.0.321
//10.10.10.10.10
//232.0.0.ac

    public static void main(String [] args)
    {
        InetAddressValidator validator = new InetAddressValidator();
        String ipAddress = "192.168.1.121";
        boolean isValid = validator.isValid(ipAddress);
        if (isValid) {
            System.out.println(ipAddress + " is valid");
        }
        else
        {
            System.out.println(ipAddress + " is not valid");
        }

    }



}
