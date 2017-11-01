import java.util.Scanner;

class Age{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int age;

System.out.print("Enter age: ");
age = input.nextInt();

if(0 <= age && age < 13)
System.out.print("Child status");
else if (13 <= age && age < 25)
System.out.print("Teen/Adult status");
else if (25 <= age && age < 37)
System.out.print("Middle-aged status");
else if (37 <= age && age < 49)
System.out.print("Senior status");
else if (49 <= age && age < 61)
System.out.print("Elderly status");
else if (61 <= age && age < 73)
System.out.print("Old age status");
else if (73 <= age && age < 85)
System.out.print("Kung Fu Masterly status");
else if (85 <= age && age < 95)
System.out.print("Wizardly status");
else 
System.out.print("Oguzhan status");

	}
}//3:54 AM 01-Nov-17