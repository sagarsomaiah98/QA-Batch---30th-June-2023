package Data_Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Logindataprovider {
	
	
	@Test(dataProvider="logindata")
	public void login(String uname, String pwd) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@DataProvider(name="logindata")
	public String[][] testData() {
		String[][] login=new String[3][2];
		login[0][0]="standard_user";
		login[0][1]="secret_sauce";
		
		login[1][0]="problem_user";
		login[1][1]="secret_sauce";
		
		login[2][0]="performance_glitch_user";
		login[2][1]="secret_sauce";
		
		return login;
		
	}

}
