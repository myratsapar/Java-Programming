import java.util.*;

public class JavaQueue {
	public static void main (String [] args){
		Queue <String> Mary = new LinkedList <String>();
		Mary.offer("Mary");
		Mary.offer("Merw");
		Mary.offer("BayramAli");
		Mary.offer("Yoloten");
		Mary.offer("Murgap");
		Mary.offer("Sakarchage");
		
		System.out.println("Mary: " + Mary);
		System.out.println("Mary: " + Mary.remove());
		Mary.offer("TurkmenKala");
		System.out.println("Mary: " + Mary);
		System.out.println("Head: " + Mary.element());
		System.out.println("Head with peek: " + Mary.peek());
		System.out.println("Polled: " + Mary.poll());
		System.out.println("Mary: " + Mary);
		System.out.println("Queue size: " + Mary.size());
		System.out.println("Removing...");
		while (!Mary.isEmpty()){
			System.out.print(Mary.remove() + " ");
		}
		System.out.println();
		System.out.print(Mary);
	}
}
/* Queue in Java:
 - offer(); adds new item to end;
 - remove(); removes 1st item and returns that item;
 - element(); returns 1st item in queue;
 - peek(); returns 1st item in queue if queue is empty returns null;
 - poll(); removes and returns 1st item;
 - size(); size of queue;
  */
 
//December 6, 2017 12:45:30 AM