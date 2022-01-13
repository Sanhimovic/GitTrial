package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchAscending 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/HotelMenuDD.html");
        WebElement ele = driver.findElement(By.xpath("//select[@id='nalapak']"));
        Select s=new Select(ele);
        ArrayList<String> list=new ArrayList<String>();
        List<WebElement> option = s.getOptions();
        int count = option.size();
        System.out.println(count);
        for (WebElement t : option) 
        {
			String text = t.getText();
			list.add(text);
		}
        Collections.sort(list,Collections.reverseOrder());
        for (String text : list) 
        {
			System.out.println(text);
		}
        
	}
}
