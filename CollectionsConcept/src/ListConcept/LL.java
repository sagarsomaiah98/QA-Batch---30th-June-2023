package ListConcept;


import java.util.LinkedList;
import java.util.List;

public class LL {

	public static void main(String[] args) {
		
List<String> students= new LinkedList<String>();
		
		students.add("steve");
		students.add("jack");
		students.add("Chris");
		//students.add(23);
		
		System.out.println(students.size());
		students.add("henry");
		students.add("dean");
		students.add("steve");
		students.add("jack");
	//	System.out.println(students.size());
		
	//	System.out.println(students.get(6));
		
		
		for(int i=0;i<students.size();i++) {
			
			System.out.println(students.get(i));
		}
		
		
	}

}
