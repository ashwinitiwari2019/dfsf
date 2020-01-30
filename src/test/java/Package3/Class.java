package Package3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class {

	public static void  main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
//		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();  // full screen
		Thread.sleep(5000);
		Dimension d = new Dimension(300,600);
		driver.manage().window().setSize(d);;
		Thread.sleep(5000);
		Point p = new Point(300, 200);
		driver.manage().window().setPosition(p);
		driver.close();
		String A_title = driver.getTitle();
		String E_title = "Google";
		
		if(A_title.equals(E_title))
		{
			System.out.println("application is accessible and is opened");
		}
		else
		{
			System.out.println("application is down at the moment");
		}
	}
}
