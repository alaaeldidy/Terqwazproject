package tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.Dynamicloadingpage;
import pages.Homepage;

public class Dynammicloadingtest extends Testbase {


public	Dynamicloadingpage Dynamicloadingobj;
public  Homepage Homeobj;
	
@Test
public void userdynamicloadingtest() throws InterruptedException
{
	Homeobj = new Homepage(driver);
	Homeobj.userpressondynamicloading();
	Dynamicloadingobj = new Dynamicloadingpage(driver);
	Dynamicloadingobj.userdynamicloading();
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.textToBePresentInElement(Dynamicloadingobj.finishword,"Hello World!"));
	
}
	
	
	
}
