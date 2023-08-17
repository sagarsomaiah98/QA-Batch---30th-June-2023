package Ignore;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Enable_Ignore_Tests {
	
	@Test(enabled=true)
	public void test1() {
		System.out.println("test1");
		
	}
	@Test(enabled=false)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		throw new SkipException("Skipping this exception");
		
	}

}
