package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {

public WebDriver driver;	
	public JavascriptExecutor jse;
    public	Pagebase(WebDriver driver)
	{
    	this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	
	public void press(WebElement ele)
	{	
	ele.click();	
	}
	
	public void write(WebElement ele,String txt)
	{	
	ele.sendKeys(txt);	
	}
	public void clear(WebElement ele)
	{
		ele.clear();
	}
	
	protected void ScrollDown()
	{
		jse.executeScript("ScrollBy(0,3000)");
	}
	
}
