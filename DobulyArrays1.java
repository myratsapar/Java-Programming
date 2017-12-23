import java.util.*;

public class DobulyArrays1 {
	public static void main(String args[]){
	int arr [][] = new int [4][5];
	Random rand = new Random();
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				arr[i][j] = rand.nextInt(50);
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}//December 23, 2017 1:01:47 AM
