package Selenium.session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleMain {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();

		// Launch a website
		d.get("https://www.seleniumhq.org");
		d.manage().window().maximize();
		String title = d.getTitle();
		System.out.println(title);
		if (!title.equals("Selenium - Web Browser Automation")) {
			throw (new Error());
		}
		WebElement download = d.findElement(By.xpath("//*[@id='menu_download']/a"));
		download.click();
		System.out.println("Now title is " + title);

		WebElement search = d.findElement(By.xpath("//*[@id='q'][@name='q']"));
		search.sendKeys("Selenium");

		WebElement Go = d.findElement(By.xpath("//*[@id='submit'][@value='Go']"));
		Go.click();
		List<WebElement> links = d.findElements(By.xpath("//div[@class=\"gs-title\"]"));
		for (WebElement link : links) {
			if (link.getText().contains("Selenium")) {
				System.out.println(link.getText());
			} else {
				System.out.println("error " + link.getText());
				throw (new Error());
			}
		}
		links.forEach(link -> {

			if (link.getText().contains("Selenium")) {
				System.out.println(link.getText());
			} else
				throw (new Error());
		});

		d.quit();
	}

}
