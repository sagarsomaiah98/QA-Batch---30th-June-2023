package ListConcept;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("john");
		al.add("steve");
		al.add("bruce");
		al.add("adam");
		
		System.out.println(al.size());
		al.add("peter");
		al.add("steve");
		System.out.println(al.size());
		
		System.out.println(al.get(5));
		System.out.println("********************");
		
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		
	}

	}


