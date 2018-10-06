package Selenium.session2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 extends BateTest{
	
	@Test
	void testTestNG() {
		String actual ="Sayani";
		String expected= "Sayani";
		System.out.println("ok");
		Assert.assertEquals(actual, expected);
	}
//	@Test
//	void testTestNG1() {
//		String actual ="Sayani";
//		String expected= "Sayani Mukherjee";
//		System.out.println("ok");
//		Assert.assertEquals(actual, expected);
//
//}
//	@Test
//	void testTestNG2() {
//		String actual ="Sayani";
//		String expected= "Sayani";
//		System.out.println("ok");
//		Assert.assertEquals(actual, expected);
//	}
}
