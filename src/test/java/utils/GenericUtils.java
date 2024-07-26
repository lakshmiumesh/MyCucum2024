package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	public void switchPage()
	{
		Set<String> handlers = driver.getWindowHandles();
		Iterator<String> it = handlers.iterator();
		String parentWin = it.next();
		String childWin = it.next();
		driver.switchTo().window(childWin);
	}

}
