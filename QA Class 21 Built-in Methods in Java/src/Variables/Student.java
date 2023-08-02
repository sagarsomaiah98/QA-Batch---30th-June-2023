package Variables;

public class Student {
//variable defined outside the method/function are called global variables or class variables	
	
	//variable defined inside the method/function are called local variables 

	public void info1() {
		String name="Lee";
		int age=10;
		char grade='A';
		int marks=90;
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);	
		System.out.println(marks);
		//System.out.println(rollNo);
	}
	public void info2() {
		String name="Kevin";
		int age=12;
		char grade='C';
		int marks=35;
		int rollNo=1;
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);	
		System.out.println(marks);
	}
		

	public static void main(String[] args) {	
		Student s = new Student();
		s.info2();

}
}
