package Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	
	@Test(dataProvider="data")
	public void test(String uname, String pwd) {
		
		System.out.println(uname+" | "+pwd);
	}
	
	
	@DataProvider(name="data")
	public String[][] testData() {
		
		String[][] logindetails= new String[3][2];
		logindetails[0][0]="username1";
		logindetails[0][1]="password1";
		logindetails[1][0]="username2";
		logindetails[1][1]="password2";
		logindetails[2][0]="username3";
		logindetails[2][1]="password3";
		
		return logindetails;
		
		
		
		
	}

}
