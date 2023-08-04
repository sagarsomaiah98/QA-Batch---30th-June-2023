package SetConcept;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Eg {

	public static void main(String[] args) {
		//duplicates are not allowed
		
		HashSet<String> colors = new HashSet<String>();
		colors.add("green");
		colors.add("black");
		colors.add("white");
		colors.add("blue");
		colors.add("brown");
		System.out.println(colors.size());
		//colors.add("Green");
		colors.add("white");
		System.out.println(colors.size());
		
		Iterator<String> it = colors.iterator();
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
		

	}

}
