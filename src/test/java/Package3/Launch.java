package Package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Testing
		driver = MyDriver.getDriver("CRM");
		driver.get("http://newtours.demoaut.com");
		WebDriverWait Wait = new WebDriverWait(driver, 60);
		Wait.until(ExpectedConditions.presenceOfElementLocated(By .xpath("")));
	}

}
