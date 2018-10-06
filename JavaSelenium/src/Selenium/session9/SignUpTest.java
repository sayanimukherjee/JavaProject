package Selenium.session9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Selenium.session8.Confirmationpage;
import Selenium.session8.YahooSignUpPage;

public class SignUpTest {

	WebDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");// to initiate chrome
		d = new ChromeDriver();

		d.get("https://login.yahoo.com/account/create?pd=c&specId=yidReg");
		d.manage().window().maximize();
	}

	/*
	 * @Test public void testPasswordError() { YahooSignUpPage yahooSignupPage =
	 * PageFactory.initElements(d, YahooSignUpPage.class);
	 * yahooSignupPage.setDriver(d); yahooSignupPage = (YahooSignUpPage)
	 * yahooSignupPage.enterfirstName("Sayani").enterSurname("Mukherjee");
	 * 
	 * Assert.assertEquals(yahooSignupPage.getPasswordError(), "This is required.");
	 * 
	 * }
	 * */
	 
	@Test
	public void checkYahooPage() {
		YahooSignUpPage yahooPage = PageFactory.initElements(d, YahooSignUpPage.class);
		yahooPage.setDriver(d);
		Confirmationpage confirmationpage = (Confirmationpage) yahooPage.enterfirstName("Sayani").enterSurname("Mukherjee")
				.enteremail("myemailforseltest").enteremailadd("@yahoo.com").enterPhoneNumber("9098761456")
				.enterPassword("thtyt@1234").entermonth("September").enterday("18").enteryear("2018").clckCont();
		
		Assert.assertEquals(confirmationpage.getphonrNumber(), "9098761456");
	}

	@Test
	public void checkPhoneNumberPage() {

		String expected = "90987 61456";
		WebElement a = d.findElement(By.xpath("//input[@name='editedPhoneNumber']"));
		String actualvalue = a.getAttribute("value");
		Assert.assertEquals(actualvalue, expected);

	}

}
