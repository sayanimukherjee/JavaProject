package Selenium.sessionn11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAnddrop {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		d = new ChromeDriver();

		d.get("http://jqueryui.com/resources/demos/droppable/default.html");
		d.manage().window().maximize();
	}

	@Test
	public void testdraganddrop() {
		WebElement a = d.findElement(By.id("draggable"));
		WebElement b = d.findElement(By.id("droppable"));

		Actions act = new Actions(d);
		act.dragAndDrop(a, b).build().perform();
		// act.clickAndHold(a).moveToElement(b).release(b).perform();
	}

}
