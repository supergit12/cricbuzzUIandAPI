package gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.PropertiesFileUtility;
import utilities.WebSiteUtility;

public class StepDef2
{
	WebSiteUtility su;
	WebDriver driver;
	FluentWait<WebDriver> wait;
	RequestSpecification req;
	Response res;
	Scenario se;
	Shared sh;
	//Just provide already created Shared class object as argument by PicoContainer at run time
	public StepDef2(Shared sh)
	{
		this.sh=sh;
		this.driver=sh.driver; //shared class driver object is assigned to local driver object
		this.req=sh.req; //shared class request object is assigned to local request object
		this.se=sh.se;
	}
	
	@When("launch site")
	public void method1() throws Exception
	{
		su=new WebSiteUtility();
		su.launchSite(driver, 
				PropertiesFileUtility.getValueFromPropertiesFile(sh.pfpath, "url"));
	}
	
	@When("send http request using GET") 
	public void method2() throws Exception
	{
		sh.res=req.get();
		this.res=sh.res; //assign that shared class response object to local response object
	}
	
	@When("close site")
	public void method3()
	{
		su.closeSite(driver);
	}
}
