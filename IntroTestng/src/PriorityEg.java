import org.testng.annotations.Test;

public class PriorityEg {
	@Test(priority=0)
	public void login() {
		
		System.out.println("*************login *********************");
	}
	@Test(priority=0)
public void order() {
		
		System.out.println("*************order *********************");
	}

	@Test(priority=4)
public void profile() {
	
	System.out.println("*************profile *********************");
}

	@Test(priority=3)
public void remove() {
	
	System.out.println("*************remove *********************");
}
	@Test(priority=6)
public void addtocart() {
	
	System.out.println("*************addtocart *********************");
}

}
