1lass Datas {
	 static int m;
	 static int n;
	 static int sum;

static void sumf(int a, int b){
	m = a;
	n = b;
	sum = m + n;
	System.out.println(sum);
	}
}
class StaticDemo{
public static void main(String[] args){
	Datas.sumf(9, 11);
	}
}//December 24, 2017 5:15 PM
