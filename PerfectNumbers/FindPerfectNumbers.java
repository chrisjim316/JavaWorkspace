/*
 * Last modified: April 4th, 2017
 * This class allows the user to set an upper limit.
 * @param long max - upper limit, which precisely equals 2^(max − 1)*(2^max − 1)
 * The computer will then find and print out all the perfect numbers to max, inclusive. 
 * The computer does this by using Mersenne prime numbers to effectively find perfect numbers. 
 * If 2p − 1 is prime, then 2^(p − 1)*(2^p − 1) is a perfect number.
 * Due to the limited range of the long variable, the program can only run up to the 7th perfect number. 
 * More info on Mersenne Primes: https://en.wikipedia.org/wiki/Mersenne_prime
 */

import java.util.Scanner; 
public class findPerfectNumbers{


    public static boolean isPrime(long n){
        if(n%2 == 0) 
        return false;
        
        for(int i = 3; i*i < n;i += 2){
            if(n % i == 0)
            return false;
        }
        
        return true;
    }//end isPrime 
        
        
        
        
    public static void main(String[] args){
        Scanner input = new Scanner (System.in); 
        System.out.println("Upper limit = 2^(input − 1)*(2^input − 1)");
        System.out.print("Enter upper limit: ");
        long max = input.nextLong();
        
        for( long i = 0 ; i <= max; i++){
            if(isPrime((long)Math.pow(2,i)-1) && i != 1)
            System.out.println( ((long)Math.pow(2, i-1)) * ((long)Math.pow(2, i) -1)  + " is a perfect number."); 
        }
    }//end test run
 
 
 
}// end class 



    

