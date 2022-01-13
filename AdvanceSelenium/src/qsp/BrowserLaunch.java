package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) 
	{
	  String key="webdriver.gecko.driver";  // this indicates which browser i want to launch.
	  String value="./software/geckodriver.exe";  //  this indicates the path of browser.
	  System.setProperty(key, value);
	  FirefoxDriver driver=new FirefoxDriver();
	}
}
