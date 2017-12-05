import java.util.*;

public class JavaArrayList {
	public static void main(String[] args){
		List <String> Lebap = new ArrayList <String>();
		Lebap.add("Seydi");
		Lebap.add("Turkmenabad");
		Lebap.add("Karabekewul");
		Lebap.add("Sayat");
		Lebap.add("Farab");
		Lebap.add("Khalach");
		
		System.out.println("Lebap: " + Lebap);
		Lebap.add(4, "Khodzhambas");
		System.out.println("Lebap: " + Lebap);
		Lebap.set(0, "Turkmenabad");
		System.out.println("Lebap: " + Lebap);
		System.out.println(Lebap.indexOf("Turkmenabad"));
		System.out.print(Lebap.lastIndexOf("Turkmenabad"));
	}
}

/* Java Array List:
 - add (); adds items to array;
 - add(index, "Item"); adds an item to index;
 - set(index, "Item"); overwrites an item to index;
 - indexOf("Item"); first index of an item;
 - lastIndexOf("Item"); last index of an item which settled up new location) 
 */

//December 5, 2017 2:31:56 AM
