import java.util.Scanner;

public class Factorial{

public static void main(String[] args){
   int number, fact = 1;
   Scanner input = new Scanner(System.in);

   System.out.print("Enter a number: ");
   number = input.nextInt();

while( 1 <= number){
   fact = fact * number;
   number--;
  }
System.out.printf("Factorial is: %d", fact);
 }
}//11:24 PM 14-Nov-17