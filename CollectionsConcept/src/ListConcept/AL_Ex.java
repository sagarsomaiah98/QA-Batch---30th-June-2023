package ListConcept;

import java.util.ArrayList;
import java.util.List;

public class AL_Ex {

	public static void main(String[] args) {
		List<Object> records= new ArrayList<Object>();
		
		records.add("steve");
		records.add(23456);
		records.add('A');
		records.add(5.9);
		records.add(true);
		
		for(int i=0;i<records.size();i++) {
			
			System.out.println(records.get(i));
		}

	}

}
