package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				// Sort the array	
				int num = arr.length;
				Arrays.sort(arr);
				 for (int i = 0; i < num; i++) {
					 System.out.println("array["+i+"]:"+arr[i]);
					
				}
				 int sum = ((num+1)*(num+2))/2;
				// loop through the array (start i from arr[0] till the length of the array)
				 for (int j = 0; j < num; j++) {
					 sum=sum-arr[j];
					 
				 }
				// print the number
				 System.out.println("missing number is:"+sum);

									
						
				

	}

}