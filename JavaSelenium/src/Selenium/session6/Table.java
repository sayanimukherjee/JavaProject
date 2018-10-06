package Selenium.session6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Table {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		d = new ChromeDriver();

		d.get("http://toolsqa.com/automation-practice-table/");
		d.manage().window().maximize();

	}

	@Test
	public void checkTable() {

		List<WebElement> tablerows = d.findElements(By.xpath("//tbody/tr"));
		Map<String, List<String>> tableMap = new HashMap<String, List<String>>();
		
		tablerows.forEach(abc -> {
			String header = abc.findElement(By.tagName("th")).getText();
			List<WebElement> cols = abc.findElements(By.tagName("td"));
			List<String> values = new ArrayList<String>();
			cols.forEach(col -> {
				values.add(col.getText());
			});
			tableMap.put(header, values);
		});
		
		System.out.println(tableMap);
	}

	@Test
	public void clickdetails() {

		String key = "Burj Khalifa";
		List<WebElement> tablerows = d.findElements(By.xpath("//tbody/tr"));
		tablerows.forEach(abc -> {
			String header = abc.findElement(By.tagName("th")).getText();
			System.out.print(header);
			if (header.equals(key)) {
				List<WebElement> cols = abc.findElements(By.tagName("td"));
				String rank = cols.get(4).getText();
				Assert.assertEquals(rank, "1");
			}
		});
	}

	@Test
	public void clickdetails2() {
		String key = "Burj Khalifa";
		String rankXpath = "//th[text()='" + key + "']/following-sibling::td[5]";
		WebElement rankKey = d.findElement(By.xpath(rankXpath));
		String rank = rankKey.getText();
		System.out.println(rank);
		Assert.assertEquals(rank, "1");

	}
}
