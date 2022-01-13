package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Data1 
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Pom_class p=new Pom_class(driver);
		p.un("admin");
		p.pas("manager");
		p.login();
	}
}
