package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
        Actions act=new Actions(driver);
        act.contextClick(ele).perform();
        Thread.sleep(3000);
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_T);
        rb.keyRelease(KeyEvent.VK_T);
	}
}
