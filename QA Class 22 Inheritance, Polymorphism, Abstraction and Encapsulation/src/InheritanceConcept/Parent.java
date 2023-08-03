package InheritanceConcept;

public class Parent {
	
	String name="Henry";
	int age =20;
	
	public void method1() {
		
		System.out.println("Method 1 defined inside parent class");
	}
	
	public void method2() {
		
		System.out.println("Method 2 defined inside parent class");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		
		p.method1();
		p.method2();
	//	p.childMethod();

	}

}
