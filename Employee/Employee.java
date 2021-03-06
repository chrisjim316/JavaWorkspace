/*
 * This class includes set and get methods for an employee's salary, first name, last name and social security number.  
 */
 
public class Employee {

      private String firstName;
      private String lastName;
      private double monthlySalary;
      private final String  socialSecurityNumber;

  public Employee (String newFN, String newLN, double newMS, String socialNumber){
  
       firstName = newFN;
       lastName = newLN;
       
       if (newMS < 0){
       monthlySalary = 0; 
       } else {
       monthlySalary = newMS; 
       }
       
       socialSecurityNumber = socialNumber; 
  }

  public void setfirstName(String fname){
       firstName = fname;
  }

  public void setlastName(String lname){
       lastName = lname;
  }


  public void setmonthlySalary(double m){
       if( m < 0){ 
           monthlySalary = 0;
       } else {
           monthlySalary = m;  
       }
   }
 
 
  public void setFirstName(String firstname){
       firstName = firstname;
  }


  public void setLastName(String lastname){
       lastName = lastname;
  }

  public void setMonthlySalary(double ms){
  
       if( ms< 0){
            monthlySalary = 0;
       } else {
            monthlySalary = ms;
       } 
       
  }
 
  public String getfirstName(){
       return firstName; 
  }
    
  public String getlastName(){
       return lastName;
  }

  public double getmonthlySalary(){
       return monthlySalary;
  }
  
  public String toString() {
      return String.format("%n%n%s: %s%s: %s%n%s: %.2f%n%n",
        "hourly employee", firstName + " " + lastName,
        "social security number", socialSecurityNumber,
        "monthly salary", + monthlySalary
      );
  }

}//end class 
