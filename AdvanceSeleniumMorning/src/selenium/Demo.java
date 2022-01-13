package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver"; //always should be in lower case
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver ffd=new FirefoxDriver();
	}
}
