package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForEachExercise 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int count = ele.size();
		System.out.println(count);
		for(WebElement  links :ele)
		{
			String text = links.getText();
			System.out.println(text);
		}
	}
}
