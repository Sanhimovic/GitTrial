package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDDAsc 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/HotelMenu.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Taj Bandra']"));
		Select sel=new Select(ele);
		List<WebElement> option = sel.getOptions();
		TreeSet<String> set=new TreeSet<String>();
		int count = option.size();
		System.out.println(count);
		for (WebElement text : option) 
		{
			String altext = text.getText();
			set.add(altext);
		}
		ArrayList<String> list=new ArrayList<String>(set);
		for (String revtext : list)
		{
			System.out.println(revtext);
		}
	}
}
