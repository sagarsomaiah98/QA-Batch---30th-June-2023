package Parameters;

public class Addition {
	
	//method with parameters/arguments
	
     public void add(int a, int b) {
    	 
    	
    	 int c=a+b;
    	 System.out.println("Adddition of two numbers "+a+" and "+b+" is "+c);
     }

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(31, 10);
		a.add(25,16);
		a.add(34,1346);
		a.add(21,1609);
		a.add(78,1336);
		a.add(2598,75);
		a.add(2455,1326);
		
		


	}

}
