package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/checkbox1.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='c1']"));
		
		boolean eleChecked = ele.isSelected();
		
		if (eleChecked) {
			System.out.println("ele is selected");
		} else {
			System.out.println("ele is not selected");
		}

	}

}
