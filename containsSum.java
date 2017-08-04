/*
 * First time playing with Eclipse IDE.
 * This is just a simple test run.
 * Quadratic runtime.
 */
 
package test;

public class containsSum {

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 6};
		int[] b = {1, 2, 7, 9};
	System.out.println(containsSum1(a, b));
	}
	
	public static boolean containsSum1(int[] a, int[] b){
		for(int i = 0; i < a.length; i++){
		for(int j = i + 1; j < a.length; j++){
			if(a[i] + b[j] == 8)
				return true;
		}
		}
		return false;
	}

}
