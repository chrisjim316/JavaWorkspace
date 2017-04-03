/*Guessing Game 1.0
 *The user has unlimited tries to guess the answer.
 *the program terminates when the user typed in the correct answer.
 */
import java.util.Scanner;
public class GuessingGame{

    public static void main(String[] args){
        Scanner io = new Scanner(System.in);      
        
        //generates a random number as the answer
        int randomNum = (int)(Math.random() * 101) + 1;  
        
        System.out.println("The answer is: "+ randomNum);
        System.out.println("Guess a number between 1 and 100, inclusive");
        int guess = io.nextInt();
        
        if(guess == randomNum)
            System.out.println("First try! You guessed it right!");       
        while(guess != randomNum){
            if(guess > randomNum)
               System.out.println("Too high, guess a smaller number!");
            if(guess < randomNum)
               System.out.println("Too low, guess a higher number!");
               guess = io.nextInt(); 
            if(guess == randomNum)
               System.out.println("You guessed it right!");   
        }
    }
    
}//end class 
