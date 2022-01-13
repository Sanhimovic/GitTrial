package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Stale 
{
	@Test
	public void demo()
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Generic g=new Generic(driver);
		g.un("admmin");
		g.login();
		driver.navigate().refresh();
		g.login();
	}
}
