/*
 * This method will return an integer array sum so that sum[k] will equal to arr[0] + arr[1] + ... + arr[k].
 * O(n^2) solution for now. 
 * If arr contains the values {1, 5, 2, 3}, after the method is executed the arr sum will contain the values {1, 6, 8, 11}.
 */
 
public class partialSums{

      
      
    public static int[] partialSums(int[] arr){
    
        int[] sum = new int[arr.length];
        
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j <= i; j++){
                    sum[i] += arr[j];
                }
            }
            
        return sum; 
        
    }// end partialSums   
   
   
   
    //test run 
    public static void main(String[]args){
        int[] arr = {1 ,5, 2, 3};
        int[] sum = partialSums(arr);
    
        System.out.println("Before execution: ");
        for(int i: arr)
            System.out.print(i + " ");
            System.out.println();
    
    
            System.out.println("After execution: ");
        for(int i: sum)
            System.out.print(i + " ");
    }  
    
    
}// end class 
