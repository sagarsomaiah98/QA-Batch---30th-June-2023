package ListConcept;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("john");
		al.add("steve");
		al.add("bruce");
		al.add("adam");
		
		System.out.println(al.size());
		al.add("peter");
		al.add("bruce");
		System.out.println(al.size());
		
		System.out.println(al.get(5));
		System.out.println("********************");
		
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		System.out.println("********************");
		ArrayList<Object> data = new ArrayList<Object>();
		data.add("Jack");
		data.add(23);
		data.add(12.36);
		data.add('A');
		for(int i=0;i<data.size();i++)
			System.out.println(data.get(i));
		
	}

}
