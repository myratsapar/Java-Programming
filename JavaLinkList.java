import java.util.*;

public class JavaLinkList {
	public static void main(String[] args){
		LinkedList <String> Dashoguz = new LinkedList <String>();
		Dashoguz.add("Darvaza");
		Dashoguz.add("Icoguz");
		Dashoguz.add("Dashoguz");
		Dashoguz.add("KunyaUrgench");
		Dashoguz.add("Gorogly");
		Dashoguz.add("Gubadag");
		Dashoguz.add("GurbansoltanEje");
		System.out.println("Dashoguz: " + Dashoguz);
		Dashoguz.add(5, "Boldumsaz");
		System.out.println("Dashoguz: " + Dashoguz);
		System.out.println("1 st: " + Dashoguz.getFirst());
		System.out.println("6 th: " + Dashoguz.get(6));
		System.out.println("Removed: " + Dashoguz.removeFirst());
		System.out.println("Removed: " + Dashoguz.removeLast());
		System.out.print("Dashoguz: " + Dashoguz);
		
	}
}
/*Java Linked List - Sorted with duplicate items
 - add(); adds items to list;
 - add(index, "item"); adds  item to that index;
 - getFirst(); gets first item from list;
 - get(index); gets item which located that index;
 - removeFirst(); removes first item;
 - removeLast(); removes last item;
 */

//December 5, 2017 1:15:17 AM