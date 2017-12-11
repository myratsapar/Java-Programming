import java.util.Arrays;
import java.util.Vector;

public class JavaVectorToArray {
	public static void main (String [] args){
		Vector <Integer> numbers = new Vector <Integer> ();
		numbers.add(45);
		numbers.add(12);
		numbers.add(34);
		numbers.add(58);
		numbers.add(83);
		numbers.add(88);
		System.out.println(numbers);
		Object arr[] = numbers.toArray();
		
		Arrays.sort(arr);
		System.out.println("The Smallest: " + arr[0]);
		System.out.println("The Largest: " + arr[5]);
	}
}//December 12, 2017 2:19:57 AM
