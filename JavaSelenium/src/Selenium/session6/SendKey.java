package Selenium.session6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SendKey {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		d = new ChromeDriver();

		d.get("https://login.yahoo.com/account/create?specId=yidReg");
		d.manage().window().maximize();

	}

	@Test
	public void enterFormDetails() {

		WebElement a = d.findElement(By.xpath("//input[@id='usernamereg-firstName']"));
		String placeholder = a.getAttribute("placeholder");
		char normalSpaceChar = " ".charAt(0);
		char htmlSpace = placeholder.charAt(5);
		int spaceValue = placeholder.charAt(5);
		int normalSpace = " ".charAt(0);
		placeholder = placeholder.replaceAll(String.valueOf(htmlSpace), String.valueOf(normalSpaceChar));
		Assert.assertEquals(placeholder, "First name");
		a.sendKeys("Sayani");
		WebElement b = d.findElement(By.xpath("//input[@id='usernamereg-lastName']"));
		b.sendKeys("Mukherjee");

		// check if entered value is correct
		String placevalue = a.getAttribute("value");
		Assert.assertEquals(placevalue, "Sayani");

		// Clear the page
		a.sendKeys(Keys.ENTER); // keyboard Event-- Press any key on keyboard
		d.findElement(By.xpath("//input[@id='usernamereg-firstName']")).clear();

	}
}
