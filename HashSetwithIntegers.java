import java.util.*;

public class HashSetwithIntegers {
	public static void main(String[] args){
		HashSet <Integer> hset = new HashSet <Integer>();
		hset.add(15);
		hset.add(4);
		hset.add(16);
		hset.add(23);
		hset.add(42);
		hset.add(8);
		hset.add(16);//Dublicated items do not allowed in Set
		
		System.out.println("Unsorted set: ");
		System.out.println(hset);
		TreeSet <Integer> sorted = new TreeSet <Integer>(hset);
		System.out.println("Sorted set: ");
		System.out.print(sorted);
	}
}
