package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generic 
{
	@FindBy(id="username")
	private WebElement user;

	@FindBy(name="pwd")
	private WebElement pass;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgn_btn;

	public Generic(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void un(String usern)
	{
		user.sendKeys(usern);
	}

	public void paswd(String passwd)
	{
		pass.sendKeys(passwd);
	}

	public void login()
	{
		lgn_btn.click();
	}
}
