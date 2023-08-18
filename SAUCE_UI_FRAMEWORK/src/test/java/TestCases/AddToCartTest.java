package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import TestBase.TestBase;

public class AddToCartTest extends TestBase {
	@BeforeMethod
	public void launch() throws IOException {
		intialize();
		LoginPage l= new LoginPage();
		l.login("standard_user", "secret_sauce");
	}
	
	
	@Test
	public void addtocart() {
		
		HomePage h = new HomePage();
		h.addToCart();
		String actual=driver.findElement(By.xpath("//button[@id='continue-shopping']")).getText();
	    assertEquals(actual, "Continue Shopping");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
