package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageobjManager {

	WebDriver driver;
	landpageobj lanObj;
	offpagobj offObj;
	
			
	public pageobjManager(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public landpageobj getLandPage()
	{
		lanObj = new landpageobj(driver);
		return lanObj;
	}
	
	public offpagobj getOfferPage()
	{
		offObj = new offpagobj(driver);
		return offObj;
	}
	
}
