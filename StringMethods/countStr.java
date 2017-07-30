/*  
 * Last modified: 1st April, 2017
 */


import java.util.*;
public class countStr{


//@param str - a string to compare to
//@param masterString - string to be manipulated
//Count number of occurences of str in masterString

public int countNumberOfStr(String str, String masterString){
    int count = 0;
    int pos = masterString.indexOf(str);
      while( pos >= 0 ){
        count++;
        masterString = masterString.substring( pos + str.length() );
        pos = masterString.indexOf(str);
    }
    return count;
}




}
