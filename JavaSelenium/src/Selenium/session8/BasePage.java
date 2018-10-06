package Selenium.session8;

import org.openqa.selenium.WebDriver;

public class BasePage implements IYahooPage {

		WebDriver driver;

		public WebDriver getDriver() {
			return driver;
		}

		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}

	}



