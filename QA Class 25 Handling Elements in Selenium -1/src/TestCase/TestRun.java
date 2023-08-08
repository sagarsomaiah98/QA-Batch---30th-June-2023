package TestCase;

public class TestRun {

	public static void main(String[] args) {
	
		LoginTest l = new LoginTest();
		l.login();
		
		AddTocartTest a = new AddTocartTest();
		a.addtocart();
		
		LogoutTest lo = new LogoutTest();
				lo.logout();

	}

}
