package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.landpageobj;
import pageObjects.offpagobj;
import pageObjects.pageobjManager;
import utils.ContextShare;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Offerpage {


	public ContextShare contshare;
		
	public Offerpage( ContextShare contshare)
	{
		this.contshare = contshare;
		
	}

@Then("^User searched for the same short name (.+) in offers page to check if product exist$")
public void user_searched_for_the_same_short_name_in_offers_page_to_check_if_product_exist(String shortName) throws Throwable {
	System.out.println("I am in Then");
	loadingOfferPage();
	offpagobj offObj = contshare.pageObjMan.getOfferPage();
	offObj.getProdName(shortName);
	offObj.searchOffItem();
	contshare.offProduct = offObj.getSearchItemName();
	
}

@Then("Ensure that both results are same")
public void Ensure_that_both_results_are_same()throws Throwable
{
	System.out.println("I am in Then");
	System.out.println("cartProduct ="+contshare.cartProduct);
	System.out.println("offProduct ="+contshare.offProduct);
	Assert.assertEquals(contshare.cartProduct,contshare.offProduct );
}


public void loadingOfferPage()
{
	landpageobj lanObj = contshare.pageObjMan.getLandPage();
	lanObj.loadOfferPage();
	contshare.genUtil.switchPage();
}

}


