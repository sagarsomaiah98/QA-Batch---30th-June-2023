package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class MapEg {

	public static void main(String[] args) {
		
		Map<String,Integer> stud= new HashMap<>();
		stud.put("peter", 200);
		stud.put("kane", 300);
		stud.put("chris", 400);
		stud.put("jes", 350);
		
		System.out.println(stud.get("chris"));
		System.out.println(stud.containsKey("kane"));
		System.out.println(stud.containsKey("steve"));
		System.out.println(stud);

	}

}
