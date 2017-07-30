/*Guessing Game 2.0 with 10 tries.
 *The program terminates after the user found the answer within 10 tries.
 *The program terminates after 10 unsuccessful tries
 */ 
 
import java.util.Scanner;
public class GuessingGame2{

    public static void main(String[] args){
        Scanner io = new Scanner(System.in);   
        
        //generates a random number as the answer
        int randomNum = (int)(Math.random() * 101) + 1;  
        
        //numberOfTriesTheUserHaveLeft
        int numTries = 10; 
           System.out.println("The answer is: "+ randomNum);
           System.out.println("Guess a number between 1 and 100, inclusive");
        int guess = io.nextInt();
        
        
            if(guess == randomNum)
                System.out.println("First try! You guessed it right! You won!");      
            
        while(numTries > 0 && guess != randomNum){
        
            if(guess > randomNum){
                System.out.println("Too high, guess a smaller number!");
                System.out.println("Number of tries left: " + --numTries); 
            }
            
            if(guess < randomNum){
                System.out.println("Too low, guess a higher number!");
                System.out.println("Number of tries left: " + --numTries); 
            }
            
            if(numTries != 0){
                guess = io.nextInt(); 
            if(guess == randomNum)
                System.out.println("You guessed it right! You won!"); 
            }
           
            if(numTries == 0)
                System.out.println("Game over!");
        }//end while loop 
        
    }
    
}// end class 
