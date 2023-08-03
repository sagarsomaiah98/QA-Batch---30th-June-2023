package PolyMorphism;

public class MethodOverloading {
	//same method Name but different arguments
	public void method1() {	
		System.out.println("Calling method 1");
	}
	
	public void method1(int a) {
	
		System.out.println("calling with integer argument");
	}
	public void method1(String b) {
		
		System.out.println("calling with string argument");
	}
	public void method1(int a, int b) {
		
		System.out.println("calling with two integer argument");
	}
	public void method1(double a) {
		
		System.out.println("calling with double argument");
	}

	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.method1(2,5);
	}

}
