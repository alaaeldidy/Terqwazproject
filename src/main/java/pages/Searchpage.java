package pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends Pagebase {

	public Searchpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//locators	
@FindBy(name="q")
WebElement Searchtxt;


@FindBy(name="btnK")
WebElement Searchbtn;	
	
@FindBy(xpath="//*[@id=\"rso\"]/div[7]/div/div/div[1]/a/h3") 
public WebElement Searchsuccess;	//message=What is Selenium Web Driver? Definition of Selenium Web ...





public void usersearchforitem(String txt) throws InterruptedException
{
	write(Searchtxt,txt);
    driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	press(Searchbtn);
    driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
}


	
	
}
