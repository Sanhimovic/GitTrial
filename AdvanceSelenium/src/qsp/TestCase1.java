package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException 
	{ 
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/TestCase.html");
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).sendKeys("Hey");
		Thread.sleep(2000);
		driver.close();
	}
}
