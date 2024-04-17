package TestUtil;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	static ExtentReports extent;
	static ExtentTest test ;
	
	public static ExtentTest getReports() {
		
		 extent = new ExtentReports();
		ExtentSparkReporter sparkreports = new ExtentSparkReporter("S:\\JANBASK\\QA Batch - 30th June 2023\\SAUCE_UI_FRAMEWORK\\test-output\\Spark");
	    sparkreports.config().setDocumentTitle("login");
	    sparkreports.config().setTheme(Theme.DARK);
	    sparkreports.config().setEncoding("utf-8");
	    
	    extent.attachReporter(sparkreports);
	    
	  //  test = extent.createTest("test 1");
	    test.log(Status.INFO, "start");
	    extent.flush();
	    return test;
	
	}
	

}
