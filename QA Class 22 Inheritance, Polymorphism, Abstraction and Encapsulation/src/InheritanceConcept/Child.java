package InheritanceConcept;

public class Child extends Parent {
	
	public void childMethod() {
		
		System.out.println("Child method defined inside child class");
	}

	public static void main(String[] args) {
		

		Child c = new Child();
		c.childMethod();
		c.method1();
		c.method2();
		System.out.println(c.name);
		System.out.println(c.age);
		
	}

}
