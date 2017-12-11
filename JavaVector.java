import java.util.Vector;

public class JavaVector {
	public static void main(String [] args){
		Vector <String> Ahal = new Vector <String>();
		String cities[] = {"Ashgabat", "Geokdepe", "Baherden", "Kypchak", "Kaka", "Tejen"};
		
		System.out.println("Vector capacity: " + Ahal.capacity());
		System.out.println("Vector size: " + Ahal.size());
		
		for(String name : cities){
			Ahal.add(name);
			System.out.print(name + " ");
		}
		Ahal.set(4, "Yashlyk");
		Ahal.add("Dushak");
		Ahal.add("Babadayhan");
		System.out.println("\nVector new capacity: " + Ahal.capacity());
		System.out.println("Vector new size: " + Ahal.size());
		System.out.println(Ahal);
				
	}
}//December 12, 2017 2:01:40 AM
