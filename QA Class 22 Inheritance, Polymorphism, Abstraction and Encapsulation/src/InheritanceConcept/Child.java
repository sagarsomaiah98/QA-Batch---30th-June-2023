package InheritanceConcept;

public class Child extends Parent{
	
	public void car() {
		
		System.out.println("Car belongs to child");
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.car();
		c.house();
		c.factory();
		System.out.println(c.grad);
		System.out.println(c.lname);
	}

}
