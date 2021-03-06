/*
 * A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding itself. 
 */
 
import java.util.Scanner; 

public class PerfectNumbers{




   //@return true if int input is perfect number, false, if otherwise.  
   
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0)
            sum += i;
        }
        
        return number == sum; 
    }
    
    
    
    
    
    
    //Test run. 
    //Calls for an input by the user.
    
     public static void main(String[] args){
        Scanner input = new Scanner (System.in); 
        System.out.print("Enter the number to be tested: ");
        int i = input.nextInt();
        if(i!=0)
        System.out.printf("Is a perfect number: " + isPerfectNumber(i));
        else 
        System.out.printf("Is a perfect number: false");
    }
    
    
    
    
}
