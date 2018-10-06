package Selenium.session6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Window {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		d = new ChromeDriver();

		d.get("https://www.flipkart.com/beauty-and-personal-care/pr?sid=t06&offer=nb:mp:0860fd9f05&fm=neo/merchandising&iid=M_769a9ae1-bf20-483a-9aab-4121e24c61d9_3.24AY8GRCLM80&ppt=Homepage&ppn=Homepage&otracker=hp_omu_Deals+of+the+Day_3_Upto+25%25%2BExtra+5%25+Off_24AY8GRCLM80_0&cid=24AY8GRCLM80");
		d.manage().window().maximize();

	}

	@Test
	public void checkWindow() {

		WebElement link1 = d.findElement(By.linkText("Fashion Bar Neon Nail Polish Combo 08 Multicolor"));
		link1.click();
		String base = d.getWindowHandle();
		Set<String> handles = d.getWindowHandles();
		handles.forEach(eachHandle -> {
			d.switchTo().window(eachHandle);
			String currentTitle = d.getTitle();
			if (currentTitle.contains("Fashion Bar Neon Nail Polish Combo 08 Multicolor")) {
				d.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			}

		});
		d.switchTo().window(base);
		System.out.println(d.getTitle());

	}

}
