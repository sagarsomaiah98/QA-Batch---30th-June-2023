package Variables;

public class GlobalVariables {
	String name="Peter";//global variable
	double salary=345.67;
	
	public void display() {
		System.out.println("in display method "+name+" and "+salary);
		System.out.println("calling display method");
	}

	public void info() {
		System.out.println("in info method "+name+" and "+salary);
		System.out.println("calling info method");
	}
	
	public static void main(String[] args) {
		GlobalVariables g = new GlobalVariables();
		g.display();
		System.out.println("************************");
		g.info();
		System.out.println(g.name);
		System.out.println(g.salary);

	}

}
