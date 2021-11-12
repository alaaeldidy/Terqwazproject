package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Testbase2 {

	public WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openurl(@Optional("chrome") String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			String path=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("firefox"))
		{
			String path=System.getProperty("user.dir")+"/Drivers/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver(); 
			
		}	
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/ncr");
		
		
	}
	
	@AfterMethod
	public void getscreenshot(ITestResult result) throws IOException
	{
	
			TakesScreenshot ts= (TakesScreenshot) driver;
			 File Source=ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(Source, new File(".//Screenshots//"+result.getName()+".png"));
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void closeurl()
	{
	driver.quit();	
	}
	
	
	
	
}
