package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		for (WebElement cbox : ele) 
		{
			cbox.click();
			Thread.sleep(2000);
		}
	}
}
