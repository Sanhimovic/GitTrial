package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertandConfirmation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		Alert aler = driver.switchTo().alert();
		aler.accept();
		aler.dismiss();
	}
}
