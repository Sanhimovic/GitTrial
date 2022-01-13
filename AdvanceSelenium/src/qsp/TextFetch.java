package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TextFetch 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/locators.html");
		WebElement ele = driver.findElement(By.xpath("//input[@class='c1']"));
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.DELETE);
		
		
	}
}
