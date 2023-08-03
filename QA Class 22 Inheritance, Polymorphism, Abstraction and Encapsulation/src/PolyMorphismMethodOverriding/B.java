package PolyMorphismMethodOverriding;

public class B extends A{
	// method overriding - overriding the method inherited from child class
	// changing the implementation of parent class method inside child class
	public void factory() {
		
		System.out.println("calling factory inside class B");
		System.out.println("Factory method redefined");
		
	}

	public static void main(String[] args) {
		B b = new B();
		b.house();
		b.factory();
	}

}
