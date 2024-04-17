package InheritanceConcept;

public class Parent {
	int grad='A';
	String lname="Winchester";
	
	//method or functions
	public void house() {
		
		System.out.println("house belongs to parent");
	}
	
	public void factory() {
		
		System.out.println("factory belongs to parent");
	}

	public static void main(String[] args) {
		
		Parent p= new Parent();
		p.house();
		p.factory();
		System.out.println(p.grad);
		System.out.println(p.lname);
		

	}

}
