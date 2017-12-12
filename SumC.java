//Constructor with parameters
public class SumC {
	int m, n, sum;
	public SumC(int a){ //constructor
		m = a;
	}
	
	public static void main (String[] args){
		SumC sC = new SumC(9);
		sC.n = 2;
		sC.sum = sC.m + sC.n;
		System.out.println(sC.sum);
	}
}//December 13, 2017 12:42:24 AM
