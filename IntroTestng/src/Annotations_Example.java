import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Example {
	
	@Test
	public void method1() {
		
		System.out.println("*********Calling method 1********************");
	}
@Test	
public void method2() {
		
		System.out.println("*********Calling method 2********************");
	}
	
@BeforeMethod
public void beforeMethod() {
	
	System.out.println("*********  before method **************");
}

@AfterMethod
public void afterMethod() {
	
	System.out.println("*********  after method **************");
}
@Test	
public void method3() {
		
		System.out.println("*********Calling method 3********************");
	}

@BeforeTest
public void beforeTest() {
	System.out.println("Before Test");
	
}

@AfterTest
public void afterTest() {
	System.out.println("after Test");
	
}
}
