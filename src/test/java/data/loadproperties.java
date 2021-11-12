package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class loadproperties
{

	public static Properties userdata = loadproperties(System.getProperty("user.dir")+"\\src\\test\\java\\data\\userdata.properties");

	private static Properties loadproperties(String path) 
	{
		Properties pro = new Properties();
		FileInputStream stream;
		try {
			stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\data\\userdata.properties");
			try {
				pro.load(stream);
			} catch (IOException e) {
				System.out.println("error"+ e.getMessage());
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			System.out.println("error"+ e1.getMessage());
		}
		
		return pro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
