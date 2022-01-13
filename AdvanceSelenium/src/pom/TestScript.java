package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestScript 
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do"); 
		Generic g=new Generic(driver);
		g.un("admin");
		g.paswd("manager");
		g.login();
		driver.close();
	}
}
