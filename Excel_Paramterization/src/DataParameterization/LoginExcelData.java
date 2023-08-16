package DataParameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExcelData {

	public static void main(String[] args) throws InterruptedException {
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA Batch - 30th June 2023\\Excel_Paramterization\\src\\TESTDATA\\SAUCE_LOGIN.xlsx");
		int rowCount=xls.getRowCount("SAUCE");
		
		//System.out.println(rowCount);
		
		
		
		
		for(int i=2;i<=rowCount;i++) {
			
			String uname=xls.getCellData("SAUCE", "USERNAME", i);
			String pwd=xls.getCellData("SAUCE", "PASSWORD", i);
			System.out.println(uname+" |"+pwd);
			
			//selenium login code
			 WebDriver driver = new ChromeDriver(); 
			 driver.manage().window().maximize();
			  driver.get("https://www.saucedemo.com/");
			  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd); 
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@id='login-button']")).click();
			  
			  driver.quit();
			
			
			
		}
		
	}

	}


