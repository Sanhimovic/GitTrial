package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DummyCss 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/Css.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='a1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='a1']")).sendKeys("Hey");
		Thread.sleep(3000);
		driver.close();
	}
}
