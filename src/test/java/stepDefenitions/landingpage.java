package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.landpageobj;
import pageObjects.pageobjManager;
import utils.ContextShare;
import utils.TestBase;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class landingpage {

	public WebDriver driver;
	public String cartProduct;
	public String offProduct;
	ContextShare contshare;
	TestBase tbase;
	landpageobj lanObj;
	
public landingpage( ContextShare contshare)
{

	this.contshare = contshare;
	lanObj = contshare.pageObjMan.getLandPage();
	
}

@Given("User is on greenCart landing page")
public void user_is_on_green_cart_landing_page()  {

	System.out.println("I am in Given");
	//contshare.driver = new ChromeDriver();

	
}

@When("^User searched with short name (.+) and extract actual name of the product$")
public void user_searched_with_short_name_and_extract_actual_name_of_the_product(String shortName) throws Throwable {
	System.out.println("I am in When");
	//lanObj = contshare.pageObjMan.getLandPage();
	lanObj.getShortName(shortName);
	lanObj.searchItem();
	Thread.sleep(1000);
	contshare.cartProduct = lanObj.getProductName();

}

@Then("User Select the amount of the product and add to cart")
public void user_Select_the_amount_of_the_product_and_add_to_cart() 
{
	lanObj.selectItemAmount();
	lanObj.addItemToCart();
}

}