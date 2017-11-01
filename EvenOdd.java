import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args){

		int number = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		number = input.nextInt();
		if(number % 2 == 0)
		System.out.printf("%d is even", number);
		else
		System.out.printf("%d is odd", number); 
	}
} //3:14 AM 01-Nov-17