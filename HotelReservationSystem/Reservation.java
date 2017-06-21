/*
 * The Reservation object is the building block of the Hotel in the system. 
 * A Reservation object contains the name of guest, room number, and the specific date of checking in.
 */

public class Reservation{

    private String guestName;
    private int roomNumber; 
    private timePeriod timeP; 
    private static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
    "September", "October", "November", "December"}; 
    
    public Reservation(String name, int number, int day, int month){
        guestName = name;
        roomNumber = number;
        timeP = new timePeriod(day, month);
    }
    
    public int getRoomNumber(){
        return roomNumber;
    }
    
    public String getGuestName(){
        return guestName;
    }
    
    //outputs information on reservation (date, roomNumber, guestName)  
    public String toString(){
    
        int monthIndex = timeP.getMonth() - 1;        
        return "Name of guest: " + guestName + "\nroomNumber: " + roomNumber + "\nDate: " + months[monthIndex] + " " + timeP.getDay(); 
        
    }
    
}//end class 
