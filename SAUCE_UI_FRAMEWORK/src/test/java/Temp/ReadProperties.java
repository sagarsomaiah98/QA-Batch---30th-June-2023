package Temp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Browser"));
		
		//System.out.println(System.getProperty("user.dir"));
		

	}

}
