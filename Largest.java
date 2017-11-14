import java.util.Scanner;

public class Largest{ //The largest of three numbers

   public static void main(String[] args){
    int a, b, c;
   
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

if (a > b && a > c){
   System.out.printf("The largest number is %d", a);
}
else if( b > c ){
   System.out.printf("The largest number is %d", b);
}
else {
   System.out.printf("The largest number is %d", c);
  }
 }
}//10:32 PM 14-Nov-17