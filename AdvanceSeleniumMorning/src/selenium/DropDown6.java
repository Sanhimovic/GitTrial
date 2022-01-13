package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown6 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/LeelaPalace.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		Select sel=new Select(ele);
		ArrayList<String> array=new ArrayList<String>();
		List<WebElement> option = sel.getOptions();
		for (WebElement text : option) 
		{
			String texts = text.getText();
			array.add(texts);
			array.remove("Peas pulav");
		}
		for (String verify : array) 
		{
			System.out.println(verify);
		}
	}

}
