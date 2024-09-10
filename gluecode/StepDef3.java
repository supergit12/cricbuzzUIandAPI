package gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.WebSiteUtility;

public class StepDef3
{
	WebSiteUtility su;
	WebDriver driver;
	FluentWait<WebDriver> wait;
	RequestSpecification req;
	Response res;
	Scenario se;
	Shared sh;
	//Just provide already created Shared class object as argument by PicoContainer at run time
	public StepDef3(Shared sh)
	{
		this.sh=sh;
		this.driver=sh.driver; //shared class driver object is assigned to local driver object
		this.req=sh.req; //shared class request object is assigned to local request object
		this.res=sh.res; //shared class response object is assigned to local response object
		this.se=sh.se;
	}
	
	@Then("http response should be {int}")
	public void task1(int esc)
	{
		int asc=res.getStatusCode();
		if(asc==esc)
		{
			se.log("Test case passed");
			Reporter.log("Test case passed");
			Assert.assertTrue(true);
		}
		else
		{
			se.log("Test case failed");
			Reporter.log("Test case failed");
			Assert.assertTrue(false);
		}
	}
	
	
}
