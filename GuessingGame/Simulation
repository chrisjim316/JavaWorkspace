/*Guessing Game Simulation.
 *Last modified: April 11th, 2017 
 *The program terminates after n tries by the computer.
 *Output win or lose. 
 *If the computer won output number of attempts. 
 *It can effectively resize its scope of guess if guess > randomNum.
 *It can not, however, deal with lowerBounds effectively yet except with the first try.
 */ 
 
import java.util.Scanner;
public class GuessingGameSimulation{
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);   
        
        //generates a random number as the answer
        int randomNum = (int)(Math.random() * 100) + 1;  
        System.out.println("(For debugging) The answer is: "+ randomNum);
            
        //numberOfTriesTheComputerHave
        System.out.println("How many tries do the computer have?");
            int numTries = io.nextInt();  
            int totalTries = numTries; 
            
        System.out.println("Objective: guess a number between 1 and 100, inclusive");
        System.out.println("Computer: I'll get it right in no time.");
            int guess = (int)(Math.random() * 100) + 1;
            numTries--;
            
        System.out.println("First guess: " + guess);
        ArrayList<Integer> upperBound = new ArrayList<Integer>();
        ArrayList<Integer> lowerBound = new ArrayList<Integer>();    
        
        if(guess == randomNum)
            System.out.println("The computer took a first shot and won!");      
            
        while(numTries > 0 && guess != randomNum){
           if(guess == randomNum){ 
           
                    numTries = totalTries - numTries; 
                    System.out.println("Computer found the answer! after " + numTries + " tries."); 
                    
            } else if (guess > randomNum){
            
                    upperBound.add(guess);
                    guess = (int)(Math.random()* guess) + 1;
                    
                    System.out.println(guess); //shows computer's guess 
                    numTries--;
                    
            } else if (guess < randomNum && totalTries - numTries != 1){
            
                    //generate randomNum up until the smallest number it guessed before.  
                    int smallest = findSmallest(upperBound); 
                    
                    //debugging purposes: System.out.println("Smallest number is: " + smallest);
                    
                    guess = (int)(Math.random()* smallest) + 1;
                    System.out.println(guess); //shows computer's guess
                    numTries--;
                    
            } else {
                    lowerBound.add(guess);
                    int largest = findLargest(lowerBound);
                    
                    //debugging purposes: System.out.println("Largest number is: " + largest);
                    
                    guess = (int)(Math.random() * 100) + 1;
                    System.out.println(guess); //shows computer's guess
                   
                    if(guess < 50)
                    guess += largest; 
            }
            
        }//end while 
         
        numTries = totalTries - numTries; //calculate total number of attempts 
        
        if(guess == randomNum)
            System.out.println("Computer found the answer! after " + numTries + " tries."); 
        else 
            System.out.println("Machines aren't perfect.");
            
     }  
     
     //find smallest value in ArrayList
    public static int findSmallest(ArrayList<Integer> list){
       int smallest = list.get(0).intValue();
       for(Integer value: list){
           if(value < smallest){
               smallest = value; 
           }
       }
       return smallest;  
    }
    
    //find largest value in ArrayList
    public static int findLargest(ArrayList<Integer> list){
       int largest = list.get(0).intValue();
       for(Integer value: list){
           if(value > largest){
               largest = value; 
           }
       }
       return largest;  
    }
    
}//end class 
