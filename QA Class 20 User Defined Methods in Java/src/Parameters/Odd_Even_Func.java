package Parameters;

public class Odd_Even_Func {
	
	public void displayEven(int limit) {
		System.out.println("Even Numbers are-->");
		for(int i=2;i<=limit;i=i+2)
			System.out.println(i);
		
	}
	
	public void displayOdd(int limit) {
		System.out.println("Odd Numbers are-->");
		for(int i=1;i<=limit;i=i+2)
			System.out.println(i);
		
	}
	

	public static void main(String[] args) {
		
		Odd_Even_Func o = new Odd_Even_Func();
		//o.displayEven(50);
		o.displayOdd(35);
		
		
		
	}

}
