/*
 * Remove all occurrences of str in s
 */

public class removeStr{

public String removeAllStr(String str, String masterString){
    int pos = masterString.indexOf(str);
      while ( pos >= 0 ){
        masterString = masterString.substring(0, pos) + s.substring(pos + str.length());
        pos = newString.indexOf(str);
      }
    return masterString;
}

}
