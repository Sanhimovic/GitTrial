package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchLinktext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/check.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    int count = ele.size();
	    System.out.println(count);
	    for (WebElement cbox : ele) 
	    {
			cbox.click();
			Thread.sleep(2000);
		}
	}
}
