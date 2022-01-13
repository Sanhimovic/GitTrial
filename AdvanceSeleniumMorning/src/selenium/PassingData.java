package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PassingData 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/locator.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Hey");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).sendKeys("Hello");
	}
}
