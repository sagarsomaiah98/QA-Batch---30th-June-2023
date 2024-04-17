package PolyMorphismMethodOverriding;

public class B extends A{
	
	//overriding- modifying the parent method in child class, changing the implementation of parent class in child class
	
	public void display() {
		
		System.out.println("display method modified");
		System.out.println("calling display method in class B");
	}

	public static void main(String[] args) {
		
		B b= new B();
		b.display();
		b.info();
		
		

	}

}
