package BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the browser
		driver.get("https://www.bing.com");
		//driver.close();
		//driver.quit();
		driver.get("https://www.saucedemo.com");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
