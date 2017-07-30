
/*
 *Replace all occurrences of str in masterString with replacementStr
 *@param replacementStr - a string replacement for every str found in masterString
 */

public class replaceStr{

public String replaceAllStr(String str, String masterString, String replacementStr){
    int pos = masterString.indexOf(str);
      while( pos >= 0 ){
        masterString = masterString.substring(0, pos) + replacementStr + masterString.substring(pos + str.length());
        pos = newString.indexOf(str);
      }
    return masterString;
}

} 
