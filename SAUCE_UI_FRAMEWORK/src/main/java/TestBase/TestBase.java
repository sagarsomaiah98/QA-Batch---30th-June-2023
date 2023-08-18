package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	FileInputStream fis;
	Properties prop;
	public static WebDriver driver;
	public void intialize() throws IOException {
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		 prop = new Properties();
		prop.load(fis);
		String bname=prop.getProperty("Browser");
		
		switch(bname){
		case "Chrome":
			driver= new ChromeDriver();
			break;
		case "Firefox":
			driver= new FirefoxDriver();
			break;
		case "Edge":
			driver= new EdgeDriver();
			break;
			
			default:
				System.out.println("Invalid Browser");		
			
		}
		driver.manage().window().maximize();
		String url=prop.getProperty("URL");
		int timeout=Integer.parseInt(prop.getProperty("Timeout"));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}

}
