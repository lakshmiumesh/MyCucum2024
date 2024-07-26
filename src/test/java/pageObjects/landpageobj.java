package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landpageobj {
	

	String shortName;
	WebDriver driver;
	
	By search = By.className("search-keyword");
	By product = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By incremenent = By.cssSelector("a.increment");
	By Add = By.xpath("//button[text()='ADD TO CART']");
			
	
	
	public landpageobj(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void searchItem()
	{
		driver.findElement(search).sendKeys(shortName);
	}
	
	public void getShortName(String name)
	{
		shortName = name;
	}
	
	public String getProductName()
	{
		return(driver.findElement(product).getText().split("-")[0].trim());
	}
	
	public void loadOfferPage()
	{
		driver.findElement(topDeals).click();
	}
	
	public void selectItemAmount()
	{
		driver.findElement(incremenent).click();
	}
	
	public void addItemToCart()
	{
		driver.findElement(Add).click();
	}

}
