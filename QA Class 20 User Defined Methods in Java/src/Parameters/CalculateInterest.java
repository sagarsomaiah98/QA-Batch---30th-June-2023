package Parameters;

public class CalculateInterest {
	
	
	public void simpleInterest(double principal, double interest, int time) {
		
		double simpleinterest =(principal*time*interest)/100;
		
		System.out.println("Simple Interest ==>"+simpleinterest);
		
		
	}

	public static void main(String[] args) {
		
		CalculateInterest c = new CalculateInterest();
		c.simpleInterest(100000, 4.5, 12);

	}

}
