package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Uploadpage;

public class Uploadtest extends Testbase {

	public Uploadpage  Uploadobj;
	public  Homepage Homeobj;
	@Test
	public void useruploadtest() throws InterruptedException
	{
		
		Homeobj = new Homepage(driver);
		Homeobj.userpressonupload();
		Uploadobj=new Uploadpage(driver);
		Uploadobj.useruploadpic();
		Assert.assertEquals("File Uploaded!",Uploadobj.fileuploadedsuccess.getText());
	}
	
	
	
	
	
}
