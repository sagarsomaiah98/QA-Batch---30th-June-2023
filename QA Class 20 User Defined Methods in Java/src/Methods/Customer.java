package Methods;

public class Customer {
	
	String name="Henry";
	int age =45;
	char dept='A';
	
	public void info() {
		
		System.out.println("Customer Name "+name);
		System.out.println("Customer age "+age);
		System.out.println("Customer dept "+dept);
		
	}
	
	
	
	

	public static void main(String[] args) {
		Customer c = new Customer();
		c.info();
		

	}

}
