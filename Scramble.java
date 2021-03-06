/*
 * This class uses a scramble method to scramble a word or a phrase
 * ScrambleAPhrase method has the ability to scramble phrases with blanks.
 * ScrambleAPhrase method will output with blanks in its original positions. 
 * It includes a driver class that calls for inputs by the user. 
 * The scrambled string/phrase will be outputted.
 */
 
import java.util.Scanner;
import java.util.ArrayList;
public class ScrambleWord{


    public static char[] scrambleAWord(String word){
        char[] c = word.toCharArray();
        for(int i = 0; i < word.length(); i++){
            int randomNum = (int)(Math.random() * (c.length));
            char temp = c[i];
            c[i] = c[randomNum];
            c[randomNum] = temp;
        }
        return c;
    }
    
    
    
    
    public static int indexOf(ArrayList<String> a, String s){
        for(int i = 0; i < a.size(); i++){
            if(((String)a.get(i)).equals(s)){
                return i;
            }
        }
        return -1; 
    }
    
    
    
    
    public static ArrayList<String> scrambleAPhrase(String phrase){
        ArrayList<String> letters = new ArrayList<String>(); 
        ArrayList<String> result = new ArrayList<String>(); 
        
        for(int i = 0; i < phrase.length()-1; i++){
            letters.add(phrase.substring(i, i+1)); 
        }
        int pos = indexOf(letters, " ");
        
        while(pos >= 0){
            for(int i = 0; i < pos; i++){
                int randomNum = (int)(Math.random() * pos); 
                String temp = (String)letters.get(i);
                letters.set(i , letters.get(randomNum));
                letters.set(randomNum, temp);
            }
            
            for(int i = 0; i < pos; i++){
                result.add(letters.get(i));
            }
            
            result.add( new String(" ")); 
            
            
            for(int i = 0; i <= pos; i++){
                letters.remove(0);
            }
            
            pos = indexOf(letters, " ");
        }
        
         if(pos == -1){
            for(int i = 0; i < letters.size(); i++){
                int randomNum = (int)(Math.random() * letters.size()); 
                String temp = (String)letters.get(i);
                letters.set(i , letters.get(randomNum));
                letters.set(randomNum, temp);
            }
            
            for(int i = 0; i < letters.size(); i++){
                result.add(letters.get(i));
            }            
            
            for(int i = 0; i < letters.size(); i++){
                letters.remove(0);
            }        
        }    
        return result;
}// end scrambleAPhrase method 
  
  
  
  
  
//Test runs. 
    public static void main(String[]args){
        Scanner io = new Scanner (System.in);
        System.out.println("Enter word to be scrambled");
        String word = io.nextLine();
        char[] getWord = scrambleAWord(word);
            for(int i = 0; i < getWord.length; i++){
                 System.out.print(getWord[i]);
            }
        System.out.println();    
        System.out.println();  

        System.out.println("Enter phrase to be scrambled (finish your phrase with a space): ");    
        String phrase = io.nextLine();
        ArrayList<String> getPhrase = scrambleAPhrase(phrase);
            for(String s: getPhrase){
                 System.out.print(s);
            }         
    }
    
}// end class 
