package Selenium.session8;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.Error.PageNotFound;

public class YahooSignUpPage extends BasePage {

	@FindBy(xpath = "//input[@id='usernamereg-firstName']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='usernamereg-lastName']")
	WebElement surname;

	@FindBy(id = "reg-submit-button")
	WebElement contBtn;

	@FindBy(id = "reg-error-password")
	WebElement passwordError;

	@FindBy(id = "usernamereg-yid")
	WebElement email;

	@FindBy(xpath = "//p[@class='yid-domain']")
	WebElement emailaddress;

	@FindBy(id = "usernamereg-phone")
	WebElement phonenumber;

	@FindBy(id = "usernamereg-password")
	WebElement password;

	@FindBy(id = "usernamereg-month")
	WebElement month;

	@FindBy(id = "usernamereg-day")
	WebElement day;

	@FindBy(id = "usernamereg-year")
	WebElement year;

	public YahooSignUpPage enterfirstName(String fname) {
		firstname.sendKeys(fname);
		return this;
	}

	public YahooSignUpPage enterSurname(String lname) {
		surname.sendKeys(lname);
		return this;

	}

	public String getPasswordError() {
		return passwordError.getText();
	}

	public IYahooPage clckCont() {
		contBtn.click();
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("account/create?")) {
			return PageFactory.initElements(driver, YahooSignUpPage.class);
		} else if (currentUrl.contains("/challenge/phone-verify?")) {
			return PageFactory.initElements(driver, Confirmationpage.class);
		} else {
			throw new PageNotFound();
		}

	}

	public YahooSignUpPage enteremail(String emailadd) {
		email.sendKeys(emailadd);
		return this;

	}

	public YahooSignUpPage enteremailadd(String emaildomain) {
		emailaddress.sendKeys(emaildomain);
		return this;

	}

	public YahooSignUpPage enterPhoneNumber(String phonenum) {
		phonenumber.sendKeys(phonenum);
		return this;

	}

	public YahooSignUpPage enterPassword(String passwd) {
		password.sendKeys(passwd);
		return this;

	}

	public YahooSignUpPage enterday(String emailday) {
		day.sendKeys(emailday);
		return this;

	}

	public YahooSignUpPage entermonth(String emailmonth) {
		month.sendKeys(emailmonth);
		return this;

	}

	public YahooSignUpPage enteryear(String emailyear) {
		year.sendKeys(emailyear);
		return this;
	}
}
