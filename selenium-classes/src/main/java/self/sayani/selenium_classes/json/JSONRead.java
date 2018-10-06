package self.sayani.selenium_classes.json;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;

public class JSONRead {
	public static void main(String[] args) throws IOException {
		File jsonFile = new File("src/main/resources/data.json");
		int expensive = JsonPath.read(jsonFile, "$.expensive");
		JSONArray bicylePrice = JsonPath.read(jsonFile, ".bicycle.price");
		System.out.println(bicylePrice);
	}
}
