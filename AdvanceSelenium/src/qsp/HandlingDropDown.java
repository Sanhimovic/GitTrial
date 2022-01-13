package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/HotelMenuDD.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='nalapak']"));
        Select s=new Select(ele);
        List<WebElement> opt = s.getOptions();
        int count = opt.size();
        System.out.println(count);
        for (WebElement options : opt) 
        {
			String text = options.getText();
			Thread.sleep(1000);
			System.out.println(text);
		}
	}
}
