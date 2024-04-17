package SetConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Eg {

	public static void main(String[] args) {
		//duplicates are not allowed
		
		Set<String> colors= new HashSet<String>();
		colors.add("red");
		colors.add("black");
		colors.add("green");
		System.out.println(colors.size());
	//	colors.add("Black");
	//	colors.add("green");
		System.out.println(colors.size());
		
	//	System.out.println(colors.get(2));
		
		Iterator<String> it= colors.iterator();
		
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());//checks if
		 * there is a value after this System.out.println(it.next());
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 * System.out.println(it.hasNext());
		 */
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
	}

}
