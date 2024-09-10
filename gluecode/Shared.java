package gluecode;

import java.util.Collection;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Shared
{
	//declare global variables and objects required in StepDef classes
	public WebDriver driver; //to contact web pages in browser
	public RequestSpecification req; //to send HTTP request
	public Response res; //to get response
	public Scenario se; //to generate cucumber reports
	public int stepno;
	public static int scenariono=1; //start with 1st scenario
	public String pfpath="src\\test\\resources\\propertiesfile\\config.properties";
	//Hooks in Cucumber	
	@Before //before every scenario by taking that scenario information
	public void method1(Scenario se) //Scenario class object will be created and provided by PicoContainer
	{
		this.se=se;
		if(se.getName()!="")
		{
			se.log("Scenario:"+scenariono+"-"+se.getName()+" is started");
			if(se.getSourceTagNames().size()!=0)
			{
				Collection<String> tags=se.getSourceTagNames();
				se.log("Tags are:");
				for(String tag:tags)
				{
					se.log("Scenario:"+scenariono+"-"+se.getName()+" is started with tag:"+tag);
				}
			}
		}
		else
		{
			se.log("Scenario:"+scenariono+" is started");
		}
		stepno=1; //set to 1 before going into steps of each scenario
	}
	
	@BeforeStep("@smoketest and not @regressiontest")
	public void method2(Scenario s) //before every step
	{
		se.log("Step-"+stepno+" is started");
	}
	
	@AfterStep("@smoketest")
	public void method3(Scenario s) //after every step
	{
		se.log("Step-"+stepno+" is completed");
		stepno++;
	}
	
	@After
	public void method4(Scenario s) //after every scenario
	{
		if(se.getName()!="")
		{
			se.log(s.getName()+" is completed with status:"+s.getStatus().name());
		}
		else
		{
			se.log("Scenario:"+scenariono+" is completed with status:"+s.getStatus().name());
		}
		scenariono++; //for next scenario
	}
}
