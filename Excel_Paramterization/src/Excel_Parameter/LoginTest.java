package Excel_Parameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.saucedemo.com/");
		 * driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(
		 * "standard_user");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "secret_sauce"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 * 
		 * driver.quit();
		 */
		
FileInputStream fis = new FileInputStream("S:\\JANBASK\\QA Batch - 30th June 2023\\Excel_Paramterization\\src\\TESTDATA\\SAUCE_LOGIN.xlsx");
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s1 =wb.getSheet("SAUCE");
		Row r1=s1.getRow(0);
		 int lastRow=s1.getLastRowNum();
		    System.out.println(lastRow);
			
		  int cellNo=r1.getLastCellNum();
		  //System.out.println(cellNo);
		  
		  
		  for(int i=1;i<=lastRow;i++) {
			  
				for(int j=0;j<cellNo;j++) 
				{
				  
				  Row row= s1.getRow(i);
				  Cell value=row.getCell(j);
				  System.out.print(value+" |");
				}
				  System.out.println();
			  }
		

	}

}
