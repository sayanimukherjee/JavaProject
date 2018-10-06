package Selenium.session2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG extends BateTest {

	@Test
	void testTestNG() {
		String actual = "Sayani";
		String expected = "Sayani";
		System.out.println("testTestNG");
		Assert.assertEquals(actual, expected);
	}

	@Test
	void testTestNG1() {
		String actual = "Sayani";
		String expected = "Sayani";
		System.out.println("testTestNG1");
		Assert.assertEquals(actual, expected);

	}

	@Test
	void testTestNG2() {
		String actual = "Sayani";
		String expected = "Sayani";
		System.out.println("testTestNG2");
		Assert.assertEquals(actual, expected);
	}

}
