package Selenium.session4;

import org.testng.annotations.Test;

import Selenium.session4.form.Stage1Data;
import Selenium.session4.form.Stage2Data;
import Selenium.session4.form.Stage3Data;

public class Parameterization {

	@Test(dataProvider = "getdata", dataProviderClass = Selenium.session4.DataProviderClass.class)
	public void testForm(InvalidFieldData data) {
		System.out.println("Data is " + data);
		System.out.println("Field name is " + data.fieldname);
		System.out.println("Value of field is " + data.value);
		System.out.println("Error message is " + data.errorMessage);

	}

	
	@Test(dataProvider = "formData", dataProviderClass = DataProviderClass.class)
	public void formSubmit(Stage1Data stage1data, Stage2Data stage2Data, Stage3Data stage3Data) {
		
	}
}
