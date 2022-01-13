package selenium;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/LeelaPalace.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		Select sel=new Select(ele);
		TreeSet<String> tree=new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> option = sel.getOptions();
		for (WebElement texts : option) 
		{
			String text = texts.getText();
			tree.add(text);
		}
		for (String options : tree) 
		{
			System.out.println(options);
		}
	}
}
