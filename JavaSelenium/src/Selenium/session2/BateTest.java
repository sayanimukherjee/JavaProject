package Selenium.session2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BateTest {
	
	@BeforeSuite
	void beforeSuite(){
		System.out.println("Inside Before Suite");
		
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("Inside After Suit");
	}
	
	@BeforeMethod
	void beforeMethod(){
		System.out.println("Inside Before Method");
		
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("Inside After Method");
	}
	
	@BeforeTest
	void beforetest() {
		System.out.println("before test");
	}


}
