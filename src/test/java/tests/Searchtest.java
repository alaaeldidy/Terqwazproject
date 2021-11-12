package tests;



import org.testng.Assert;
import org.testng.annotations.Test;
import data.loadproperties;
import pages.Searchpage;

public class Searchtest extends Testbase2 {

	public Searchpage  Searchobj;
	
	String textsearch=loadproperties.userdata.getProperty("Textsearch");
	
	@Test
	public void usersearchtest() throws InterruptedException
	{
		Searchobj=new Searchpage(driver);	
		Searchobj.usersearchforitem(textsearch);
		Assert.assertEquals("What is Selenium Web Driver? Definition of Selenium Web ...",Searchobj.Searchsuccess.getText());
		
	}
	
	
	
	
	
}
