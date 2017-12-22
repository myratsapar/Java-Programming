public class DobulyArrays {
	
	public static void main(String args[]){
		int arr [][] = new int [4][5];
			for(int i = 0; i < arr.length; i++){
				for (int j = 0; j < arr[i].length; j++){
					arr[i][j] = i*j;
					System.out.print(arr[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
	}
}//December 23, 2017 12:55:29 AM
