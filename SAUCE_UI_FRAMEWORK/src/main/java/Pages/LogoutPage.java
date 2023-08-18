package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.TestBase;

public class LogoutPage extends TestBase {
	
	//Constructor
		public LogoutPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		WebElement menu;
		
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		WebElement logout;
		
		
		

	}


