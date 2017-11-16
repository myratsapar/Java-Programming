import java.util.Scanner;

public class LeapYear{
   public static void main(String[] args){
   int year;
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a year [yyyy]: ");
   year = input.nextInt();

if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
   System.out.printf("%d is a Leap year", year); 
}

else {
   System.out.printf("%d is not a Leap year", year);
   } 
  }
}//10:30 PM 14-Nov-17