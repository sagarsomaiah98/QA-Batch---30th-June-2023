package AbstractionConcept;

public class Test extends AbstractionEg {

	public static void main(String[] args) {
		Test t = new Test();
		t.method1();
		t.method2();
		t.method3();
		t.method4();

	}

	@Override
	public void method1() {
		System.out.println("calling method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("Calling method 2");
		
	}

}
