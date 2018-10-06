package Selenium.session7;

import org.testng.annotations.Test;

public class TestSuite2 {
	
	@Test(groups= {"Sanity"})
	public void method3() {
		System.out.println("Method3");
	}
	
	@Test(groups= {"Sanity", "Regression"})
	public void method4() {
		System.out.println("method4");
	}

}
