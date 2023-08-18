package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class HomePage extends TestBase {
	//Constructor
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		WebElement addtocart;
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		WebElement cart;
		
		@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
		WebElement remove;
		
		@FindBy(xpath="//select[@class='product_sort_container']")
		WebElement filter;
		
  public void addToCart() {
	  addtocart.click();
	  cart.click();
	  
  }
  
  public void removeFromCart() {
	  addtocart.click();
	    remove.click();
	  
  }
		
	}