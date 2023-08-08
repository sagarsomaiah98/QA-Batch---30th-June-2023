package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLogin {
	
	public void login(String uname, String pwd) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		System.out.println(uname+ " login successful");
		}
		catch(Exception e)
		{
			System.out.println(uname+" Login Failed");
		//String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		//System.out.println(error);
		}
		driver.quit();
		
	}

	public static void main(String[] args) {
		MultipleLogin m = new MultipleLogin();
		m.login("standard_user","secret_sauce");
		m.login("locked_out_user","secret_sauce");
		m.login("problem_user","secret_sauce");
		m.login("performance_glitch_user","secret_sauce");

	}

}
