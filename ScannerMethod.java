import java.util.Scanner;

public class ScannerMethod{
	public static void main(String[] args){
		String name;
		int age;
Scanner input = new Scanner(System.in);
System.out.printf("Enter name: ");
name = input.nextLine();
System.out.printf("Enter age: ");
age = input.nextInt();
System.out.printf("Hi %s, you are %d\n", name, age);
	}
}