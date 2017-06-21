import java.util.ArrayList;

public class Hotel{

    private Reservation[] hotelRooms;
    private ArrayList<String> waitList = new ArrayList<String>();     

    
    //creates 30 default reservations for the hotel of 50 rooms to test methods and debug. 
    
    public Hotel(){
        hotelRooms = new Reservation[50];
        for(int i = 0; i < 50; i++){
            hotelRooms[i] = new Reservation("Mr. Wolverine", i, 3, 31);
        }    
    }
    
    
    //creates a customized hotel with numRooms; 
    
    public Hotel(int numRooms){
        hotelRooms = new Reservation[numRooms];
        for(int i = 0; i < numRooms-10; i++){
            hotelRooms[i] = new Reservation("Ms. Wolverina", i, 4, 31);
        }    
    }
    
    
    
    //create reservation if there are an empty room for the guest.
    //otherwise, add the guest to the end of the waitList.
    //@return null if no empty rooms are found.
    //@return Reservation if a reservation has been created for an empty room
    
    public Reservation requestRoom(String guestName, int day, int month){
        for(int i = 0; i < hotelRooms.length; i++){
            if( hotelRooms[i] == null){
                hotelRooms[i] = new Reservation(guestName, i, day, month);
                return hotelRooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }
    
    
    //cancel this particular reservation 
    //potentially added: the guest can only cancel the reservation two days prior to check in.
    
    public void cancelReservation(Reservation res){
    
        int roomNum = res.getRoomNumber();
        String guestName = res.getGuestName();

        if(hotelRooms[roomNum] != null){
                 hotelRooms[roomNum] = null;
                 System.out.println("Dear " + guestName + ", your reservation has been successfully cancelled.");
                 System.out.println("In the meantime please check out our other wonderful services.");  
        } else {        
                 System.out.println("Dear " + guestName + "there was no reservation associated with your account.");
                 System.out.println("If you think this is a mistake please contact us via phone or email.");         
        }
        
    }
      
}//end class 
