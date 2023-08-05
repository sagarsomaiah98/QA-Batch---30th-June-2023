package BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumhq.org");
		driver.navigate().to("https:www.saucedemo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
