import java.util.Scanner;

public class Positive{ //Positive or not

   public static void main(String[] args){
   int number;

   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number: ");
   number = input.nextInt();

if (number > 0){
   System.out.println("You entered positive number");
}
else{
   System.out.println("You entered negative number");
   }
  }
}//9:58 PM 14-Nov-17