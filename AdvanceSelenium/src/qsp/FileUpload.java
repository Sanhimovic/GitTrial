package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/sampleform.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='upload here']"));
		ele.sendKeys("C:\\Users\\sandeep\\OneDrive\\Desktop\\SeleniumUrl's.txt");
	}
}
