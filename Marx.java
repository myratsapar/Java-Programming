import java.util.Scanner;

class Marx{
	public static void main(String[] args){
	int mark, passmark = 46;

	
Scanner input = new Scanner(System.in);

System.out.print("Enter your mark: ");
mark = input.nextInt();

if (mark > passmark){
   System.out.println("Congratulations! You passed the exam");
}
else{
   System.out.println("UnFortunately you failed to pass the exam");
    }
  }
}//9:48 PM 14-Nov-17