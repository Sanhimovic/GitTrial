package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFieldDisabled {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/disabled1.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='t1']"));
		ele.sendKeys("hey");
		
		boolean eleEnabled = ele.isEnabled();
		
		if (eleEnabled) {
			System.out.println("ele is enabled");
		} else {
			System.out.println("ele is not enabled");
		}
	}
}
