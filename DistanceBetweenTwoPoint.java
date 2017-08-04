/*
 * Calculates distance between two coordinates on the xy plane. 
 * Possible round-off error using Math.sqrt. 
 */
 
import java.util.Scanner;
public class DistanceBetweenPoints{
	  public static void main(String[]args){
	      Scanner input = new Scanner(System.in);
	    	char counter;
	    	double x1, x2, y1, y2;
	  do{
  	    	System.out.printf("Enter x1:");
       		x1 = input.nextDouble();
	       	System.out.printf("Enter y1:");
	       	y1 = input.nextDouble();
	       	System.out.printf("Enter x2:");
	       	x2 = input.nextDouble();
	      	System.out.printf("Enter y2:");
	      	y2 = input.nextDouble();
	
	       	double theDistance = distance(x1, y1, x2, y2);
      	 	System.out.printf("The distance between points (%.1f,%.1f) and (%.1f,%.1f) is %.1f%n",x1 , y1, x2, y2, theDistance);
	       	System.out.printf("Enter 'y' if you want to enter another pair of points 'n' if you do not:");
	       	counter = input.next().charAt(0);
            
      } while(counter == 'y');      
        
	  }//end main.
	     
	     
	  public static double distance(double x1, double y1, double x2, double y2){ 
         return Math.sqrt( Math.pow( ( x1 - x2 ), 2 ) + Math.pow( ( y1 - y2 ), 2 ) );
    }
    
}//end class 
