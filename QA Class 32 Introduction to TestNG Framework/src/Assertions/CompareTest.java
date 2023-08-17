package Assertions;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CompareTest {
	
	@Test
	public void compare() {
		String name="James";
		
		//assertEquals(name, "Jame");
		//assertEquals("John", "Johnny");
		assertEquals(23, 13,"not matching");
		
		
		
		
		
	}

}
