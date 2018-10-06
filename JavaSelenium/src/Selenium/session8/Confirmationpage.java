package Selenium.session8;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirmationpage extends BasePage {

	@FindBy(xpath = "//input[@name='editedPhoneNumber']")
	WebElement phoneNum;

	public String getphonrNumber() {
		String actualvalue = phoneNum.getAttribute("value");
		return actualvalue.replaceAll(" ", "");

	}

}
