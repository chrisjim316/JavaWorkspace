import java.io.*;
import java.util.*;

/*
 * Encrypting and decrypting message using an algorithm that takes an int array of keys.
 * This program uses an algorithm that replaces each letter in the plaintext by a letter some fixed number of positions down the alphabet.
 * For example: A becomes C when val 2 is added.
 * If length of message is longer than key arr, key arr can be reused over and over again until message is fully decrypted.
 * Uppercase letters will remain uppercase, same goes for lowercase letters.
 */
 
public class test {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
      
       System.out.println("Enter message to be encrypted:");
       String input = sc.nextLine();
       System.out.println();
       System.out.println("Enter a numerical password of any length to begin decryption.");
       System.out.println("Enter the password in one line.. Example: 134679");
       String password = sc.nextLine();
       password = password.replaceAll("\\s|[,]", ""); //omit all blank spaces and commas from input
       String[] integers = password.split("");
       int[] keys = new int[integers.length];
       for(int i = 0; i < integers.length; i++) {
           keys[i] = Integer.parseInt(integers[i]); //convert password into int array of keys
       }
       System.out.println();
       
       input = encrypt(input, keys);
       System.out.println("Encrypting text based on password provided...\n");
       System.out.println("===========================================================");
       System.out.println("Encrypted message:");
       System.out.println(input); //print encrypted message 
       System.out.println("===========================================================");
       System.out.println();

       System.out.println("Password to begin decryption?");
       System.out.println("Note: If the password is wrong, you will get randomized letters");
       String password2 = sc.nextLine();
       password2 = password2.replaceAll("\\s|[,]", ""); //omit all blank spaces and commas from input
       String[] integers2 = password2.split("");
       int[] keys2 = new int[integers2.length];
       for(int i = 0; i < keys2.length; i++) { 
           keys2[i] = Integer.parseInt(integers2[i]); //convert password into int array of keys
       }
       System.out.println();
             
       String result = decrypt(input, keys2);
       System.out.println("Decrypting text based on password provided...\n");
       System.out.println("===========================================================");
       System.out.println("Decrypted message:");
       System.out.println(result); //print decrypted message
       System.out.println("===========================================================");
       
   }
   
   public static String encrypt(String string, int[] key) { 
       int len = key.length;
       String[] arr = string.split("");
       String result = "";
       
       int i = 0;
       for(String str: arr) {
           if(i == len) {
               i = 0;
           } 
           if(str.matches("[A-Z]")) {
               char c = (char)((((int)str.charAt(0)) + key[i] - 65) % 26 + 65);
               result += c;
               i++;
           } else if (str.matches("[a-z]")) {
               char c = (char)((((int)str.charAt(0)) + key[i] - 97) % 26 + 97);
               result += c;
               i++;
           } else {
               result += str; 
           }
       }
       return result;
   }
   
   public static String decrypt(String string, int[] key) {
       int len = key.length;
       String[] arr = string.split("");
       String result = "";
       
       int i = 0;
       for(String str: arr) {
           if(i == len) {
               i = 0;
           } 
           if(str.matches("[A-Z]")) {
               char c;
               if((int)str.charAt(0) - key[i] < 65){
                   int temp = (int)str.charAt(0) - key[i];
                   int remainder = 65 - temp; 
                   c = (char)(90 - remainder + 1);
               } else {
                   c = (char)((((int)str.charAt(0)) - key[i] - 65) % 26 + 65);
               }
               result += c;
               i++;
           } else if (str.matches("[a-z]")) { 
               char b;
               if((int)str.charAt(0) - key[i] < 97){
                   int temp = (int)str.charAt(0) - key[i];
                   int remainder = 97 - temp; 
                   b = (char)(122 - remainder + 1);
               } else {
                   b = (char)((((int)str.charAt(0)) - key[i] - 97) % 26 + 97);
               }
               result += b;
               i++;
           } else {
               result += str; 
           }
       }
       return result;
   }
}
