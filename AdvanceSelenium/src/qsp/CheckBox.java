package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/check.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int count = ele.size();
        for(int i=0;i<count;i++)
        {
        	WebElement y = ele.get(i);
        	y.click();
        	Thread.sleep(2000);
        }
	}
}
