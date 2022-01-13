package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass1 extends Generic
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("acti"));
		System.out.println("validated");
	}
}
