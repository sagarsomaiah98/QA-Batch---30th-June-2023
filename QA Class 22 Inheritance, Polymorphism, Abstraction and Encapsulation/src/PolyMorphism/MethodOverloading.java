package PolyMorphism;

public class MethodOverloading {
	//same method Name but different arguments
	
	
	public void method1(){
		
		System.out.println("calling method 1");
	}
	
	
	public void method1(int a) {
		
		System.out.println("calling method with integer argument");
	}

public void method1(double a) {
		
		System.out.println("calling method with double argument");
	}
public void method1(int a, double b) {
	
	System.out.println("calling method with int and double argument");
}

public void method1(String name, double sal) {
	
	System.out.println("calling method with String and double argument");
}


	public static void main(String[] args) {
		
     MethodOverloading m = new MethodOverloading();
   m.method1(56);

	}

}
