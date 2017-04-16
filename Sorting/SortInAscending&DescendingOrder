/*
 * This class contains sorting methods to sort an int array into both ascending and descending order.
 */
 
public class Sort{
    
    //sort int[] arr in ascending order.
    public static void sortFromSmallToLarge(int[] arr){
    
        for(int i = 0; i < arr.length - 1; i++){
        
            int index = i;
            
            for(int j = i + 1; j < arr.length - 1; j++){
                if(arr[j] < arr[index])
                    index = j;
            }
            
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            
        }       
        
    }//end sortFromSmallToLarge
    
    
    //sort int[] arr in descending order.
    public static void sortFromLargeToSmall(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
        
            int index = i;
            
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[index])
                    index = j;
            }
            
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            
        }            
    }//end sortFromLargeToSmall
    
    
}//end class 
