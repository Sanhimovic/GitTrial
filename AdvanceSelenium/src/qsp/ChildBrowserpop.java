package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserpop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(5000);
		String pid = driver.getWindowHandle();
		System.out.println("parent id: "+pid);
		Set<String> alid = driver.getWindowHandles();
		int count = alid.size();
		System.out.println(count);
		for (String all : alid) 
		{
			System.out.println(all);
		}
	}
}
