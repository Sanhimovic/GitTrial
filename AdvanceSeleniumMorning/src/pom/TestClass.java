package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass 
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		BaseClass bs=new BaseClass(driver);
		bs.username("admin");
		bs.password("manager");
		bs.login();
	}
}
