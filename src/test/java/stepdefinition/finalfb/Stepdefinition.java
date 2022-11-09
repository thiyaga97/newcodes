package stepdefinition.finalfb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import baseclass.fbfinal.BaseClass;
import commons.utility.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobject.fbfinal.PageObject;

public class Stepdefinition extends BaseClass 
{
	
	public static WebDriver driver;
	public static PageObject page;
	public static ConfigReader config;
	
	@Before
	public void beforeExecution() {
		try {
			driver=  browserLaunch();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void afterexecution() {
		driver.close(); 
	}
	
	
	@Given("launch Facebook application")
	public void launch_Facebook_application() throws IOException 
	
	{
		 config = new ConfigReader();				
		 urlLaunch(config.getApplicationUrl());
	}

	  @When("^Enter valid  \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void enter_valid_and_invalid(String string, String string2)
	{		
	    page= new PageObject(driver);
	    page.getTextPass().sendKeys(string);
	    page.getTextUser().sendKeys(string2);
	    
	    
	}

	@When("Click login button")
	public void click_login_button() throws InterruptedException 
	{
		
		page= new PageObject(driver);
		page.getClickLogin().click();
		Thread.sleep(3000);
		  
	}
	
}
