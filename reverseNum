/*
 * Asks for a int input, reverses it, and output it in the end.
 */
 
import java.util.Scanner;

public class ReverseNumber{

      public static void main(String[]args){
    
          Scanner input = new Scanner(System.in);
          
          System.out.printf("Enter a number to be reversed:");
          int x = input.nextInt();
       
          System.out.printf("The reverse of %d is %d%n",x ,reverseNum(x));

      }

    public static int reverseNum(int x){
    
          int reversedNum = 0;
          
          while (x != 0){    
              int lastDigit = x % 10;
              reversedNum = reversedNum * 10 + lastDigit;
              x /= 10; 
    	    }
          
        return reversedNum;
        
    }//end reverseNum
     
}//end class 
