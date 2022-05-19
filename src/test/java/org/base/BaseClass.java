package org.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	public static Properties properties;

	public static String configReader(String key) throws IOException {

		File file = new File(
				"C:\\Users\\sabas\\eclipse-workspace\\CucumberMarch\\src\\test\\resources\\Configuration.properties");
		FileReader fileReader = new FileReader(file);
		properties = new Properties();
		properties.load(fileReader);

		String string = properties.get(key).toString();

		return string;

	}

}
