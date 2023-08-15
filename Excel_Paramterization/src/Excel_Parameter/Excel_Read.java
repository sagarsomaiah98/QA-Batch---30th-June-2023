package Excel_Parameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\QA Batch - 30th June 2023\\Excel_Paramterization\\src\\TESTDATA\\TESTSUITE.xlsx");
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s1 =wb.getSheet("GMAIL");
		
		Row r1=s1.getRow(3);
		
		Cell c1=r1.getCell(1);
		
		//System.out.println(c1);
	    int lastRow=s1.getLastRowNum();
	    System.out.println(lastRow);
		
	  int cellNo=r1.getLastCellNum();
	  //System.out.println(cellNo);
		
	  
	  for(int i=0;i<=lastRow;i++) {
		  
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
