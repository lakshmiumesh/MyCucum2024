package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.pageobjManager;

public class ContextShare {
	

	public String cartProduct;
	public String offProduct;
	public pageobjManager pageObjMan;
	public TestBase tBase;
	public GenericUtils genUtil;
	
	public ContextShare() throws IOException
	{
		tBase = new TestBase();
		pageObjMan = new pageobjManager(tBase.webDriverManager());
		genUtil = new GenericUtils(tBase.webDriverManager());
	}

}
