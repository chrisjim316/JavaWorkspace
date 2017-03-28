/*
 * Some in 0(n^2) and one in 0(n). 
 * arePermutations1() & arePermutations2() takes two int arrays.
 * arePermutations3() takes two strings. 
 * @return true if they are permutations of each other.
 */

import java.util.*;
public class Permutations{
    
    
    
//no duplicates situation. 
    public static boolean arePermutations1(int[] a1, int[] a2){
        for(int i = 0; i < a1.length; i++){
                int count = 0;
            for(int j = 0; j < a2.length; j++){
                if(a1[i] == a2[j])
                   count = 1;
            }
                if(count != 1)
                   return false;
        }
        return true;
    }
    
    
    
    
    
//yes duplicates situation. 
    public static boolean arePermutations2(int[] a1, int[] a2){
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
         for(int integerValue: a2){
            secondArray.add(integerValue);
         }
        
          for(int i = 0; i < a1.length ; i++){
             for(int j = 0; j < secondArray.size(); j++){
                 if(a1[i] == secondArray.get(j).intValue())
                 secondArray.remove(j);
          }                
        }
         
        if(secondArray.size() == 0)
           return true;
        else 
           return false;
    }  
           
           
           
           
           
//Taken from Cracking the Code Interview.
//The only linear solution here. 

    public class Permutation {
	public boolean arePermutations3(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[256];

		char[] s_array = s.toCharArray();
		for(char c : s_array) {
			letters[c]++;
		}

		for(int i = 0; i < t.length(); i++) {
			int c = (int)t.charAt(i);
			if(--letters[c] < 0) {
				return false;
			}
		}

		return true;
	}
}
    
    
    
    
    //Test run.
    public static void main(String[]args){
              System.out.println("Your 2 arrays to compare: ");
        int[] a1 = {2, 3, 5, 6, 2};
        int[] a2 = {2, 6, 2, 5, 3};
           for(int i : a1)
              System.out.print(i + " ");
           for(int j : a2)
               System.out.print(j + " ");
               System.out.print("T/F. Are these two arrays permutations?");
               System.out.println(" "+ arePermutations1(a1, a2));
               System.out.println(" "+ arePermutations2(a1, a2));
               System.out.println(" "+ arePermutations3(a1, a2));
        
    }
   
}
