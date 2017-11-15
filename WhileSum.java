import java.util.Scanner;

public class WhileSum{

public static void main(String[] args){

   int first, last, sum = 0;

   Scanner input = new Scanner(System.in);
   System.out.print("Enter first & last number: ");
   first = input.nextInt();
   last = input.nextInt();

while(first <= last){
   sum = sum + first;
   first = first + 1;
  }
System.out.print("Sum is: " + sum);
 }
}//11:55 PM 14-Nov-17