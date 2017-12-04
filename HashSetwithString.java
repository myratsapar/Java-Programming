import java.util.*;

public class HashSetwithString {
	public static void main(String[] args){
		HashSet <String> TKM = new HashSet <String>();
		TKM.add("Akhal");
		TKM.add("Balkan");
		TKM.add("Dashoguz");
		TKM.add("Lebap");
		TKM.add("Mary");
		TKM.add("Ashgabat");
		TKM.add("Balkanabad");
		TKM.add("Dashoguz"); //Duplicated items do not allowed in Set
		TKM.add("Turkmenabad");
		TKM.add("Mary");//Duplicated items do not allowed in Set
		
		System.out.println("Unsorted set: ");
		System.out.println(TKM);
		TreeSet <String> sorted = new TreeSet <String>(TKM);
		System.out.println("Sorted set: ");
		System.out.print(sorted);
	}
}
//December 4, 2017 11:26:43 PM