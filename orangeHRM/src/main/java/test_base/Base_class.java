package test_base;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import data_from_properties.property_data;

public class Base_class {
	 WebDriver driver;
	public void launchBrowser() throws IOException {
		String browser=property_data.GetDataFromPropertyFile("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay thadkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\akshay thadkar\\eclipse-workspace\\orangeHRM\\src\\test\\resources\\edgedriver.exe");
			 driver=new EdgeDriver();
		}
	}
	
	public void openUrl() throws IOException {
		String url=property_data.GetDataFromPropertyFile("url");
		driver.get(url);
	}
}
