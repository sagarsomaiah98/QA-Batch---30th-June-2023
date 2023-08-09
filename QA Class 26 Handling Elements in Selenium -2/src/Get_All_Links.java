import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links  {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
	List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.println("Total no of links is --> "+links.size());
	
	for(int i=0;i<links.size();i++) {
		
		String value=links.get(i).getText();
		System.out.println(value);
		
	}
		
		
	}
}
