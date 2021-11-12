package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Uploadpage extends Pagebase {

	public Uploadpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

//locators
@FindBy(id ="file-upload")
WebElement fileuploader;


@FindBy(id ="file-submit")
WebElement filesubmit;

@FindBy(xpath ="//*[@id=\"content\"]/div/h3")
 public WebElement fileuploadedsuccess;       //message=File Uploaded!

public void useruploadpic() throws InterruptedException
{
	String image_name="Little-Mermaid.jpg";
	String image_path=System.getProperty("user.dir")+"\\Uploads\\"+image_name;
	fileuploader.sendKeys(image_path);
	filesubmit.click();
	driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
}


	
	
}
