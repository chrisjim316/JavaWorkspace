//test run. 

import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numRooms = 100;
        Hotel hotelTransylvania = new Hotel(numRooms); //creates a sample hotel with numRooms. 
        
        System.out.println("===============================================");
        System.out.println("Welcome to Hotel Transylvania!");
        System.out.println("We have " + rooms + " rooms");
        System.out.println("===============================================");
        System.out.println();
        
        System.out.println("Enter information to create a reservation");
        System.out.println("Enter your name: ");
          String name = input.nextLine();
        System.out.println("Enter the month of your stay: ");
          int month = input.nextInt();
        System.out.println("Enter the day of your stay: ");
          int day = input.nextInt();
        
        System.out.println();
        
        if(hotelTransylvania.requestRoom(name, day, month) != null){
            System.out.println("You have successfully created a reservation.\n");
            Reservation res = hotelTransylvania.requestRoom(name, day, month);
            System.out.println(res.toString());  //outputs information on reservation. 
        } 
        
    }
    
}//end class 
