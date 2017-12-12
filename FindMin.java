import java.util.*;

public class FindMin {

	public static void main(String[] args){
		Random rnd = new Random();
		int arr[] = new int[rnd.nextInt(10)];
		
		System.out.print("Original array: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = rnd.nextInt(100);
			System.out.print(" " + arr[i]);	
		}
		
		Arrays.sort(arr);
		
		System.out.print("\nSorted   array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(" " + arr[i]);	
		}	
		System.out.println("\nThe Smallest: " + arr[0]);
	}
}//December 13, 2017 12:11:14 AM
