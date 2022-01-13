package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFieldDisplayed {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/page.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='t1']"));
		
		boolean eleDisp = ele.isDisplayed();
		
		if (eleDisp) {
			System.out.println("text field is displayed");
		} else {
			System.out.println("text field is not displayed");
		}
	}
}
