package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScriptFacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Hey");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(2000);
	}
}
