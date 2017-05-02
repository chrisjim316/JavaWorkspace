/*
 * timePeriod is an object that contains the information of the specific day and month.
 * Will be used for booking hotel rooms and determining the availibility of schedules.  
 * Will include date of checkIn and checkOut in future editions. 
 */
 
 public class timePeriod{
 
      private int day;
      private int month; 
      private int minutes; 
      private int hours; 
      
      //default constructor 
      public timePeriod(){
          day = 1;
          month = 1;
      }
      
      public timePeriod(int d, int m){
          day = d;
          month = m; 
      }
      
      public int getDay(){
          return day;
      }
      
      public int getMonth(){
          return month; 
      }
      
      public int getMin(){
          return minutes;
      }
      
      public int getHours(){
          return hours; 
      }
      
      public void setDay(int d){
          day = d;
      }
      
      public void setMonth(int m){
          month = m; 
      }
      
      public void setHour(int hour){
          hours = hour;
      }
      
      public void setMinute(int min){
          minutes = min; 
      }
      
      public void incrementMinute(int min){
          minutes += min;
          hours += minutes/60;
          minutes %= 60;
          
          day += hours/24; 
          hours %= 24; 
          
          month += day/31;
          day %= 31; 
      }
      
      public void incrementHour(int hour){
          hours += hour; 
          day += hours/24; 
          hours %= 24; 
          
          month += day/31;
          day %= 31; 
      }
     
      public String toString(){
          return ""; // to be replaced; 
      }
      
 }//end class 
