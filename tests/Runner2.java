package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Real testing(Run all features one after other)
@CucumberOptions(
		features={"src\\test\\resources\\features"},
		glue={"gluecode"},
		monochrome=true,
		plugin={"pretty","html:target\\realtestres.html","rerun:target\\realtestfailedres.txt"}
		)
public class Runner2 extends AbstractTestNGCucumberTests
{
}











