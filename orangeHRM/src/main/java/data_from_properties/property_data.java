package data_from_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class property_data {
	static Properties properties=new Properties();
	public static String GetDataFromPropertyFile(String key) throws IOException {
			String propFilePath="C:\\Users\\akshay thadkar\\eclipse-workspace\\orangeHRM\\src\\test\\resources\\test_Data\\config.properties";
		    FileInputStream file=new FileInputStream(propFilePath);
		    properties.load(file);
		    String value= properties.get(key).toString();
		return value;
	}
}
