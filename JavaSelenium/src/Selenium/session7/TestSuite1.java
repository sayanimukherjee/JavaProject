package Selenium.session7;

import org.testng.annotations.Test;

public class TestSuite1 {
	
	static int i = 0;
	@Test(groups= {"Sanity"})
	public void method1() {
		i++;
		System.out.println("Method1-> "+i);
	}
	
	@Test(groups= {"Sanity"})
	public void method2() {
		i++;
		System.out.println("method2-> "+i);
	}
	@Test(groups= {"Sanity"})
	public void method5() {
		i++;
		System.out.println("Method5-> "+i);
	}
	@Test(groups= {"Sanity"})
	public void method6() {
		i++;
		System.out.println("Method6-> "+i);
	}
	@Test(groups= {"Sanity"})
	public void method7() {
		i++;
		System.out.println("Method7-> "+i);
	}
	@Test(groups= {"Sanity"})
	public void method8() {
		i++;
		System.out.println("Method8-> "+i);
	}

}
