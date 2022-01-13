package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class 
{
	@FindBy(id="username")
	private WebElement user;

	@FindBy(name="pwd")
	private WebElement pass;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgn_btn;

	public Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void un(String username)
	{
		user.sendKeys(username);
	}

	public void pas(String password)
	{
		pass.sendKeys(password);
	}

	public void login()
	{
		lgn_btn.click();
	}
}
