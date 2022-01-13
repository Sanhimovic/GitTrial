package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionPresentorNot 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/HotelMenuDD.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='nalapak']"));
        Select se=new Select(ele);
        se.deselectAll();
	}
}
