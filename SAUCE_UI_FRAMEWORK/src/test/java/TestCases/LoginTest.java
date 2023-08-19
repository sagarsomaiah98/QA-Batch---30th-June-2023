package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestBase.TestBase;
import TestUtil.Util;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void launch() throws IOException {
		intialize();
	}
	
	
	@Test
	public void validLogin() throws IOException {
		try {
		LoginPage l = new LoginPage();
		l.login("standard_user", "secret_sauce");
		String actual=driver.findElement(By.xpath("//span[@class='title']")).getText();
		Util.Screenshot();
		
		assertEquals(actual, "Products");
		}
		catch(Exception e) {
			System.out.println("failed to login");
			Util.Screenshot();
			
		}
		
	}
	
	@Test
	public void inValidLogin() throws IOException {
	
		try {
		LoginPage l = new LoginPage();
		l.login("username1", "secretsauce");
		String actual=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		assertEquals(actual, "Epic sadface: Username and password do not match any user in this service");
		Util.Screenshot();
		}
		catch(Exception e) {
			System.out.println("Not able to see error message");
			Util.Screenshot();
			
		}
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
