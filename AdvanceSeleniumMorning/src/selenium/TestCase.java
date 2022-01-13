package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/page.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='t1']"));
		ele.sendKeys("ABC");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='t2']"));
		ele1.sendKeys("CBA");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"v");

	}

}
