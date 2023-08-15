package Excel_Parameter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel_Write {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//create workbook
		Workbook wb = new HSSFWorkbook();
		
		//create sheets
		Sheet s1 = wb.createSheet("SHEET A");
		Sheet s2 = wb.createSheet("SHEET B");
		Sheet s3 = wb.createSheet("SHEET C");
		
		//create rows
		
		Row r1 = s1.createRow(0);
		Row r2 = s2.createRow(1);
		
		//create cell
		Cell c1=r2.createCell(0);
		Cell c2=r2.createCell(1);
		Cell c3=r2.createCell(2);
		
		//write to cell
		
		c1.setCellValue(234);
		c2.setCellValue("Sample");
		c3.setCellValue(45.6);
		
		try  (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA Batch - 30th June 2023\\Excel_Paramterization\\src\\TESTDATA\\Test.xls")) {
		    wb.write(fileOut);
		}
		System.out.println("done");

	}

}
