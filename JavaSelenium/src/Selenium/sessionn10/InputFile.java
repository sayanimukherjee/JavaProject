package Selenium.sessionn10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	
	public static String getData(String fileName, int row, int col) throws IOException {
		File dataFile = new File("Resources/"+fileName);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(dataFile.getAbsolutePath()));
		int i = 1;
		while(i < row) {
			br.readLine();
			i++;
		}
		String expectedrow = br.readLine();
		String[] colValues = expectedrow.split(",");
		String expectedcol = colValues[col];
		return expectedcol;
	}

}
