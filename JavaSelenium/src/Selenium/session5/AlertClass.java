package Selenium.session5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertClass {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		d = new ChromeDriver();

		d.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
		d.manage().window().maximize();
		String actual_title = d.getTitle();
		System.out.println(actual_title);

	}

	@Test
	public void popUpClickOne() throws InterruptedException {

		WebElement warnFrame = d
				.findElement(By.xpath("//h2[text()='Confirmation Dialog Box']/preceding-sibling::iframe"));
		d.switchTo().frame(warnFrame);
		WebElement clickOne = d.findElement(By.xpath("//*[@type='button'][@onclick='Warn();']"));
		clickOne.click();
		String textOne = d.switchTo().alert().getText();
		String expectedTextOne = "This is a warning message!";
		Assert.assertEquals(textOne, expectedTextOne);
		d.switchTo().alert().accept();

	}

	@Test
	public void popUpClickTwo() {
		d.navigate().refresh();
		WebElement warnFrame2 = d
				.findElement(By.xpath("//h2[text()='Confirmation Dialog Box']/following-sibling::iframe[1]"));
		d.switchTo().frame(warnFrame2);
		WebElement clickTwo = d.findElement(By.xpath("//input[@type='button'][@onclick='getConfirmation();']"));
		clickTwo.click();

		String textTwo = d.switchTo().alert().getText();
		d.switchTo().alert().dismiss();
		clickTwo.click();
		d.switchTo().alert().accept();
		System.out.println(textTwo);
		String expectedtestTwo = "Do you want to continue ?";
		Assert.assertEquals(textTwo, expectedtestTwo);

		// WebDriverWait wait = new WebDriverWait(d, 5);
		// wait.until(ExpectedConditions.invisibilityOf(clickTwo));

	}

	@Test
	public void popUpClickThree() {

		d.navigate().refresh();
		WebElement warnFrame3 = d.findElement(By.xpath("//h2[text()='Prompt Dialog Box']/following-sibling::iframe"));
		d.switchTo().frame(warnFrame3);
		WebElement clickThree = d.findElement(By.xpath("//input[@type='button'][@onclick='getValue();']"));
		clickThree.click();

		String textThree = d.switchTo().alert().getText();
		d.switchTo().alert().accept();

		String expectedtestThree = "Enter your name : ";
		Assert.assertEquals(textThree, expectedtestThree);
		

		String checkMessege3 = warnFrame3.getText();
		System.out.println(checkMessege3);

	}

}
