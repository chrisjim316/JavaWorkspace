/*
 * This clock displays the time in digital format. 
 * Will be updated with 24 hours format soon (displaying time in 24:00:00 format)
 */
 
 
public class DigitalClock{

     private int hours;
     private int minutes;
    
    
      public DigitalClock(int hrs, int mins){
          hours = hrs;
          minutes = mins;
      }
    
    
      public int getHours(){
          return hours;
      }
     
    
      public int getMinutes(){
          return minutes;
      }
    
    
    //adds hours and minutes to the digitalClock.
      public void increment(int hrs, int mins){
          hours += hrs;
          minutes += mins;
        
          hours = hours + minutes / 60;
          minutes = minutes % 60;
      }
    
    
    //increment hours by 1.
     public void incrementHr(){
          hours++;
      }
    
    
    //increment minutes by 1.
     public void incrementMin(){
          minutes++;
      }
      
      
}//end class 
