package gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.PropertiesFileUtility;
import utilities.WebSiteUtility;

public class StepDef1
{
	WebSiteUtility su;
	WebDriver driver;
	FluentWait<WebDriver> wait;
	RequestSpecification req;
	Response res;
	Scenario se;
	Shared sh;
	//Shared class object will be created & provided by PicoContainer at run time 
	public StepDef1(Shared sh) 
	{
		this.sh=sh;
		this.se=sh.se;
	}
	
	@Given("open {string} browser")
	public void open_browser(String bn) throws Exception
	{
		su=new WebSiteUtility();
		sh.driver=su.openBrowser(bn); //shared class driver object is created here
		this.driver=sh.driver; //assign that shared class driver object to local driver object
	}
	
	@Given("define http request for {string} matchid")
	public void define_http_request_for_matchid(String mid) throws Exception
	{
		sh.req=RestAssured.given();
		sh.req.baseUri(PropertiesFileUtility.getValueFromPropertiesFile(sh.pfpath,"baseuri"));
		sh.req.basePath("mcenter/v1/"+mid+"/hscard");
		sh.req.header("X-RapidAPI-Key",
				    PropertiesFileUtility.getValueFromPropertiesFile(sh.pfpath,"X-RapidAPI-Key"));
		sh.req.header("X-RapidAPI-Host",
				    PropertiesFileUtility.getValueFromPropertiesFile(sh.pfpath,"X-RapidAPI-Host"));
		this.req=sh.req; //assign that shared class request object to local request object
	}
	
	@Then("title should be contain {string}")
	public void title_should_be_contain(String etitle)
	{
		String atitle=driver.getTitle();
		if(atitle.contains(etitle))
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
