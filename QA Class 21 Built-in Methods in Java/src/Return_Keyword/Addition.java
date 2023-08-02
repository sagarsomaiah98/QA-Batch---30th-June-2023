package Return_Keyword;

public class Addition {
	int k=40;
	
	public int add(int a, int b) {
		
		int c=a+b;
		//System.out.println(c);
		
		return c;
	}
	
	
	public static void main(String[] args) {
		
		Addition a = new Addition();// creating a object
		int output=a.add(90,20);// call the method
		System.out.println(output);
		
		
		
		  if(output>10) 
			  System.out.println("its greater than 10"); 
		  else
		  System.out.println("its less than 10");
		 
		
		
		
	}

}
