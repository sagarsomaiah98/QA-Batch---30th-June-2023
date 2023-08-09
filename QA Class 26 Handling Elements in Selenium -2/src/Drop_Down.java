import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;






public class Drop_Down  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
    WebElement dropDown= driver.findElement(By.xpath("//select[@id='first']"));
    
    Select sel = new Select(dropDown);
    Thread.sleep(2000);
    sel.selectByIndex(2);
    Thread.sleep(2000);
    sel.selectByValue("Yahoo");
    Thread.sleep(2000);
    sel.selectByVisibleText("Bing");
    
		 

	}

}
