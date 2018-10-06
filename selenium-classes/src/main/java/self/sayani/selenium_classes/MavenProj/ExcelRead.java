package self.sayani.selenium_classes.MavenProj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream inputStream = new FileInputStream(
				new File("src/main/resources/ExcelData.xlsx").getAbsolutePath());
		XSSFWorkbook myexcel = new XSSFWorkbook(inputStream);
		XSSFSheet getsheet = myexcel.getSheet("Sheet1");
		XSSFRow getrow = getsheet.getRow(1);
		Iterator it = getrow.cellIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		XSSFCell getcell = getrow.getCell(0);
		System.out.println("Cell value is " + getcell);

	}
}
