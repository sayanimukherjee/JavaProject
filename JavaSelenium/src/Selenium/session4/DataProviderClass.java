package Selenium.session4;

import org.testng.annotations.DataProvider;

import Selenium.session4.form.Stage1Data;
import Selenium.session4.form.Stage2Data;
import Selenium.session4.form.Stage3Data;

public class DataProviderClass {
	@DataProvider
	public static Object[][] getdata() {

		InvalidFieldData data1 = new InvalidFieldData("name", "@asfgafs", "Spl character not allowed");
		InvalidFieldData data2 = new InvalidFieldData("phone", "@12343434", "Only numbers are allowed in phone number");
		InvalidFieldData data3 = new InvalidFieldData("email", "tyth-hgyghg", "incorrect email format");

		Object[][] dataSet = { { data1 }, { data2 }, { data3 } };
		return dataSet;
	}

	@DataProvider
	public static Object[][] formData() {

		String[][] stage1 = { { "Raj", "Kumar" }, { "Shan", "Kapoor" }, { "Yash", "Chopra" } };
		Stage1Data[] stage1Data = new Stage1Data[stage1.length];
		for (int i = 0; i < stage1.length; i++) {
			stage1Data[i] = new Stage1Data(stage1[i][0], stage1[i][1]);
		}
		String[][] stage2 = { { "9898989898", "abc@gmail.com" }, { "7854235699", "dcv@gmail.com" },
				{ "9658674539", "xyz@gmail.com" } };
		Stage2Data[] stage2Data = new Stage2Data[stage2.length];
		for (int i = 0; i < stage2.length; i++) {
			stage2Data[i] = new Stage2Data(stage2[i][0], stage2[i][1]);
		}

		String[][] stage3 = { { "hgjh", "909090" }, { "ihjj", "745869" }, { "rtrgrtrtrt", "676560" } };
		Stage3Data[] stage3Data = new Stage3Data[stage3.length];
		for (int i = 0; i < stage3.length; i++) {
			stage3Data[i] = new Stage3Data(stage3[i][0], stage3[i][1]);
		}

		Object[][] returnData = new Object[stage1.length][3];
		
		for (int i = 0; i<=stage3Data.length; i++) {
			returnData[i][0] = stage1Data[i];
			returnData[i][1] = stage2Data[i];
			returnData[i][2] = stage3Data[i];
		}
		return returnData;
	}
}
