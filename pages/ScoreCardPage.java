package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

public class ScoreCardPage 
{
	//properties for locating elements
	private WebDriver driver;
	private FluentWait<WebDriver> wait;
	@FindBy(xpath="//div[contains(@class,'cb-scrd-lft-col')]")
	@CacheLookup
	private WebElement sctable;
	
	//Constructor method for connecting to step definition classes and runner classes
	public ScoreCardPage(WebDriver driver, FluentWait<WebDriver> wait)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		this.wait=wait;
	}
	
	//methods to operate and observe elements
	public boolean isScoreCardTableDisplayed()
	{
		if(sctable.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getruns(int innings, int batsman)
	{
		String temp=sctable.findElement(
				By.xpath("child::div[@id='innings_"+innings+"']/div[contains(@class,'cb-scrd-itm')]["+batsman+"]/div[3]")).getText();
		return(Integer.parseInt(temp));
	}
	
	public String getname(int innings, int batsman)
	{
		String temp=sctable.findElement(
				By.xpath("child::div[@id='innings_"+innings+"']/div[contains(@class,'cb-scrd-itm')]["+batsman+"]/div[1]")).getText();
		return(temp);
	}
	
	public int getballs(int innings, int batsman)
	{
		String temp=sctable.findElement(
				By.xpath("child::div[@id='innings_"+innings+"']/div[contains(@class,'cb-scrd-itm')]["+batsman+"]/div[4]")).getText();
		return(Integer.parseInt(temp));
	}

}
