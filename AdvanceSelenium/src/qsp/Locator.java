package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/locator1.html");
	  WebElement ele = driver.findElement(By.className("c2"));
	  Thread.sleep(2000);
	  ele.click();
	}
}
