/*
 * A subclass of Employee with additional hourlyWage. 
 */
 
public class HourlyEmployee extends Employee{

    private double hours;
    private double wage; 
    
    public HourlyEmployee(String firstName, String lastName, double monthlySalary, String socialSecurityNumber, double hours, double wage){
        super(firstName, lastName, monthlySalary, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }
    
    public double earning(){
        return hours * wage; 
    }
    
    public void setWage(double wage){
        if(wage >= 0)
        this.wage = wage;
    }
    
    public void setHours(double hours){
        if(hours > 0 && hours < 168)
        this.hours = hours;
    }
     
    public String toString() {
        return super.toString() + String.format("%s: %.1f%n%s: %.2f%n%s: %.2f%n",
            "hours", hours,
            "wage", wage,
            "earnings", earning()                                       
        );
    }
    
    
}//end class
