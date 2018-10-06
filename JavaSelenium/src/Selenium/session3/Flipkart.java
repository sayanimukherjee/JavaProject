package Selenium.session3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		d = new ChromeDriver();

		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		String actual_title = d.getTitle();
		System.out.println(actual_title);
		String expected_title = "Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
		Assert.assertEquals(actual_title, expected_title);

		// close login
		WebElement login = d.findElement(By.xpath("// *[@class='_2AkmmA _29YdH8']"));
		login.click();

		WebElement mobile = d.findElement(By.xpath("// span[text()='Electronics']"));
		mobile.click();

		WebDriverWait wait = new WebDriverWait(d, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Motorola']")));

		WebElement moto = d.findElement(By.xpath("//*[@title='Motorola']"));
		moto.click();

		// WebDriverWait wait1 = new WebDriverWait(d, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("// *[@class='_2cLu-l']")));

	}

	@Test
	void toTestAllAreMotoMobiles() {
		// check if Moto appears
		By b = By.xpath("// *[@class='_2cLu-l']");
		List<WebElement> links = d.findElements(b);
		for (WebElement link : links) {
			String actual = link.getText().split(" ")[0];
			Assert.assertEquals(actual, "Moto");
			// if (!link.getText().contains("Moto")) {
			// throw (new AssertionError(""));
			// }
		}
	}

	@Test
	void toTestUnder10KMobiles() {
		List<WebElement> links = d.findElements(By.xpath(
				"//h2[contains(text(),'under ₹10K')]/ancestor::div[@class='_1GRhLX _3NTa49 required-tracking']//div[@class='_1uv9Cb']"));
		for (WebElement link : links) {
			String actual = link.getText().split("₹")[1];//h1[contains(text(),'Automation Practice Table')]
			// System.out.println("actual is " +actual);
			String firstSplit = actual.split(",")[0];
			// System.out.println("first split "+firstSplit);
			String secondSplit = actual.split(",")[1];
			// System.out.println("second split "+secondSplit);

			String actualPrice = firstSplit + secondSplit;
			System.out.println("Actual price " + actualPrice);

			int actualPrice1 = Integer.parseInt(actualPrice);

			if (actualPrice1 > 10000) {
				throw new AssertionError("actualPrice is greater than 10000 " + actualPrice1);
			}
		}

	}

	// check for dropdown
	@Test(priority = 1)
	public void testDropdown() {

		WebElement ViewAllButton = d.findElement(By.xpath(
				"//h2[contains(text(),'under ₹10K' )]/ancestor::div[@class='_1GRhLX _3NTa49 required-tracking']//a[@class='_2AkmmA _1eFTEo']"));
		ViewAllButton.click();

		WebDriverWait wait = new WebDriverWait(d, 5);
		wait.until((ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='_1YoBfV']//select[@class='fPjUPw']"))));

		List<String> priceList1 = getPriceList(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		System.out.println(priceList1);
		Select ddList = new Select(d.findElement(By.xpath("//div[@class='_1YoBfV']//select[@class='fPjUPw']")));
		ddList.selectByValue("20000");
		d.navigate().refresh();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// check if the values are under 20K
		List<WebElement> links=null;
		List<String> priceList2 = getPriceList(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		System.out.println(priceList2);
//		boolean found = false;
//		while(!found) {
//			try {
//				links = d.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
//				found = true;
//			}catch (StaleElementReferenceException ex) {
//				continue;
//			}
//		}
//		
//		//List<WebElement> links = d.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
//		for (WebElement link : links) {
//			String actualReplace₹ = link.getText().replace("₹", "");
//			String actualReplaceComma = actualReplace₹.replace(",", "");
//
//			int actualAmount = Integer.parseInt(actualReplaceComma);
//			System.out.println("Mobiles under 20K " + actualAmount);
//			
//			if (actualAmount > 20000) {
//				throw new AssertionError("Mobiles are not under ₹20000 " + actualAmount);
//
//			}
//
//		}

	}
	
	private List<String> getPriceList(By by){
		List<String> priceList = new ArrayList<String>();
		List<WebElement> listWE = d.findElements(by);
		listWE.forEach(ele->{
			try {
				priceList.add(ele.getText());
			}catch(StaleElementReferenceException ex) {
				System.out.println("inside get price "+priceList);
				getPriceList(by);
			}
		});
		return priceList;
	}

	/*
	 * private int parseInt(String actualPrice) {
	 * 
	 * return Integer.parseInt(actualPrice); }
	 */
}
