//Constructor with two parameters
public class SumD {
	int m, n, sum;
	public SumD(int a, int b){ //constructor
		m = a;
		n = b;
	};
public static void main(String[] args){
	SumD sD = new SumD(6, 9);
	sD.sum = sD.m + sD.n;
	
	System.out.println(sD.sum);
	}
}//December 13, 2017 12:48:49 AM
