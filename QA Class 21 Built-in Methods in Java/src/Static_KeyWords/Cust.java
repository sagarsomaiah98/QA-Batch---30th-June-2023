package Static_KeyWords;

public class Cust {
	//static variables
	static int age=20;
	static String name="Bob";
	
	//static method
	public static void cust_info() {
		
		System.out.println("calling cust_info");
	}
	//static methods
	public static void cust_salary() {
		
		System.out.println("calling cust_Salary");
	}

	public static void main(String[] args) {
		
     System.out.println(age);
     System.out.println(name);
     cust_info();
     cust_salary();
		
		
	
	}

}
