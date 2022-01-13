package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchOptionandCount 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/HotelMenu.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='Taj Bandra']"));
		Select sel=new Select(ele);
		List<WebElement> option = sel.getOptions();
		int count = option.size();
		System.out.println(count);
		for (WebElement tx : option) 
		{
			String text = tx.getText();
			System.out.println(text);
		}
	}
}
