import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		Actions a = new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		a.doubleClick(button).build().perform();
		

	}

}
