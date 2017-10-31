import java.util.Scanner;

public class ScannerMethod{
	public static void main(String[] args){
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = input.nextLine();
		System.out.print("Enter age: ");
		age = input.nextInt();
		System.out.printf("Hi %s, you are %d\n", name, age);
	}
} //2:36 AM 01-Nov-17
