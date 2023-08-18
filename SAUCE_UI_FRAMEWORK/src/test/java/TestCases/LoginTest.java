package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestBase.TestBase;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void launch() throws IOException {
		intialize();
	}
	
	
	@Test
	public void validLogin() {
		
		LoginPage l = new LoginPage();
		l.login("standard_user", "secret_sauce");
		String actual=driver.findElement(By.xpath("//span[@class='title']")).getText();
		
		assertEquals(actual, "Products");
		
	}
	
	@Test
	public void inValidLogin() {
	
		LoginPage l = new LoginPage();
		l.login("username1", "secretsauce");
		String actual=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		assertEquals(actual, "Epic sadface: Username and password do not match any user in this service");
		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
