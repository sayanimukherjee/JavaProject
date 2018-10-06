package Selenium.session3;

import org.testng.annotations.Test;

public class Testorder {
	
	@Test 
	public void c() {
		
		System.out.println("C");
		throw new Error();
	}
	@Test (dependsOnMethods= {"c"})
	public void a() {
		System.out.println("A");
	}
	

}

