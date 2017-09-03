import java.util.*;
import java.io.*;

public class regEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNoInput = sc.nextLine();
        String phoneNo = phoneNoInput.trim().replaceAll("P:", "");
        phoneNo = maskPhoneNo(phoneNo);
        System.out.println("initiate? Y/N");
        String input = sc.nextLine();
        while(input.equals("Y")) {
            System.out.println("P:" + phoneNo);
            System.out.println("continue? Y/N");
            
            input = sc.nextLine();
            
            phoneNoInput = sc.nextLine();
            phoneNo = phoneNoInput.trim().replaceAll("P:", "");
            phoneNo = maskPhoneNo(phoneNo);
        }
    }
    
    public static String maskPhoneNo(String str) {
        str = str.replaceAll("[()]|(\\s)|(-)", ""); //remove all brackets and whitespaces 
        str = str.replaceAll("\\d(?=.{4,}$)", "*"); //exclude last 4 digits
        return str.substring(0,3) + "-" + str.substring(3,6) + "-" + str.substring(6);
    }
}
