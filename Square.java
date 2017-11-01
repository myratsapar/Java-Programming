import java.util.Scanner;
class Square{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int number, result = 0;

	System.out.print("Enter a number: ");
	number = input.nextInt();
	result = number * number;
	System.out.printf("Square of %d is: %d", number, result);
	}
} //3:03 AM 01-Nov-17