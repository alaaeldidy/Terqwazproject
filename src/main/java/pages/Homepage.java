package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase {

	public Homepage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(linkText ="File Upload")
	WebElement fileuploadbtn;
	
	@FindBy(linkText ="Dynamic Loading")
	WebElement dynamicloadingbtn;
	
	public void userpressonupload()
	{
		fileuploadbtn.click();
		
	}
	
	
	public void userpressondynamicloading()
	{
		press(dynamicloadingbtn);
		
	}
	
	
}
