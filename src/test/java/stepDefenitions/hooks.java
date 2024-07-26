package stepDefenitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import utils.ContextShare;
import utils.TestBase;

public class hooks {
	
	public WebDriver driver;
	ContextShare contshare;
	TestBase tbase;
	

	public hooks(ContextShare contshare)
	{
		this.contshare = contshare;
	}
	
	@After
	public void afterScenario() throws IOException
	{
		
	}
}
