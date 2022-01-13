package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountofLinks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int count = ele.size();
		System.out.println(count);
		for (WebElement link : ele) 
		{
			String text = link.getText();
			System.out.println(text);
		}
	}
}
