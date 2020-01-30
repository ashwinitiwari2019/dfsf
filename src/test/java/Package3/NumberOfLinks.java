package Package3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NumberOfLinks { 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = MyDriver.getDriver("CRM");
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		List<WebElement> T_lnk = driver.findElements(By.tagName("a"));
		int N_lnks = T_lnk.size();
		System.out.println("the total no of links available are : "+ N_lnks);
		for (int i=0; i<=N_lnks;i++)
		{
			String L_text = T_lnk.get(i).getText();
			System.out.println(i + "the link is :" + L_text);
		}
	}

}
