package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Dynamicloadingpage extends Pagebase {

	public Dynamicloadingpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//locators
@FindBy(linkText ="Example 2: Element rendered after the fact")
WebElement Ex2;

@FindBy(css ="button")
WebElement startbtn;

@FindBy(id ="finish")
public WebElement finishword;	//message="Hello World!";


public void userdynamicloading() throws InterruptedException
{
	press(Ex2);
	driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	press(startbtn);

}
	
	
}
