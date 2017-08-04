  /*
   * Every digit of a selfDivisor is a divisor of the that number. 
   * 36 is a self divisor because 3 & 6 are divisors of that number. 
   * Only positive integers called be called self-divisors.
   * Any positive integers with a 0 is not a self-divisor. 
   */
public class selfDivisor{

   public boolean selfDivisor ( int number ){
        int n = number;
          while ( n > 0 ){
              int digit = n % 10;
              if(digit == 0 || number % digit != 0)
                return false;
              n /= 10;
          }
       return true; 
   }
   
}
