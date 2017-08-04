import java.util.Scanner;

/*
 * Calculate factorials using both recursion and iteration. 
 */

public class Factorial{

    public int iterativeFactorial(int number){
        int factorial = 1;
        for( int i = number; i >= 1; i-- ){
            factorial *= i;
        }
        return factorial;
    }




//used long instead of int because the range of int is too small.
   
    public long recursiveFactorial(long number){
        if( number <= 1 )
            return 1;
        else
            return number * recursiveFactorial(number - 1);
    }





//output factorials using recursiveFactorial() method.
//test run. 

  public static void main(String[] args){
      Scanner io = new Scanner(System.in);
      System.out.println("output factorials for values 0 to which number?");
      long number = io.nextLong(); 

      for( int k = 0; k <= number; k++){
          System.out.printf("%d! = %d%n", k, recursiveFactorial(k));
      } 
   }
   
} //end class 
