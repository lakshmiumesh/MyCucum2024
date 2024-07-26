package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offpagobj {
	
	public WebDriver driver;
	String prodName;
	
	By search = By.id("search-field");
	By offProdName = By.cssSelector("tr td:nth-child(1)");
	
	public offpagobj(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void getProdName(String prodName)
	{
		this.prodName = prodName;
	}
	
	public void searchOffItem()
	{
		driver.findElement(search).sendKeys(prodName);
	}
	
	public String getSearchItemName()
	{
		return(driver.findElement(offProdName).getText());
	}

}
