import java.util.*;

public class ReverseArray {
	public static LinkedList <Integer> reverse(LinkedList<Integer> given){
		LinkedList <Integer> send = new LinkedList <Integer> ();
		int i = given.size()-1;
		while (i >= 0){
			send.add(given.get(i));
			i = i - 1;
		}
		return send;
	}
	public static void main(String [] args){
		LinkedList <Integer> list = new LinkedList<Integer>();
		Random rnd = new Random();
		for (int i = 0; i < rnd.nextInt(15); i++){ //rnd - length of array
			list.add(rnd.nextInt(100)); //rnd - contain of array
		}
		System.out.println(list);
		System.out.println(reverse(list));
	}
}//December 12, 2017 1:20:23 AM
