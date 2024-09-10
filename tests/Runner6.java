package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\resources\\features\\myfeature1.feature"},
		glue={"gluecode"},
		monochrome=true,
		plugin={"pretty",
				"html:target/mycucumber.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)
public class Runner6 extends AbstractTestNGCucumberTests
{
	//1. install scoop CLI
	//2. install allure CLI
	//3. add dependency "io.qameta.allure-cucumber7-jvm" to pom.xml file
	//4. add plugin "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" in cucumber options
	//5. run allure report at cmd prompt  
}











