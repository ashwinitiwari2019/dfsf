package Package3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver {

	public static WebDriver getDriver(String Brw) {
		//TODO Auto generated method stub
		if (Brw.contentEquals("CRM"))
		{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\chromedriver.exe");
		return new ChromeDriver();
	} 
	else if(Brw.equals("IEEE"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\IEDriverServer.exe");
		return new InternetExplorerDriver();
	}
	else if(Brw.equals("FF"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\geckodriver.exe");
		return new FirefoxDriver();
	}
	else
	{
		return null;
	}
	}
	}
