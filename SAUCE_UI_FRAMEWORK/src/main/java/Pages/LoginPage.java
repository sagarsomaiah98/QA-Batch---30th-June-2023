package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LoginPage extends TestBase{
	
	//Constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	
	
	public void login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
        login.click();		
	}

}
