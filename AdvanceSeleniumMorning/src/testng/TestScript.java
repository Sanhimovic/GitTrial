package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript extends BaseClass
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "actiTIME - Enter Time-");
		System.out.println("validated");
		s.assertAll();
	}
}
