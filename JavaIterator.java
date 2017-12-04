import java.util.*;

public class JavaIterator {
	public static void main(String[] args){
		HashSet BN = new HashSet();
		BN.add("Turkmenbashi");
		BN.add("Khazar");
		BN.add("Balkanabad");
		BN.add("Bereket");
		BN.add("Bekdash");
		
		Iterator city = BN.iterator();
		
		while (city.hasNext()){
			System.out.println(city.next());
		}
		
		city.remove();
		System.out.print(BN);
	}
}

/* Java Iterator:
- next(); return next item;
- hasNext(); Boolean;
- remove(); Deletes last item;
*/
//December 5, 2017 12:09:45 AM
