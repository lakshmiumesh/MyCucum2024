package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	Properties prop = new Properties();
	
	public WebDriver webDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);
		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			driver.get(url);
		}
	 
	 return driver;
	}
	

}
