package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSimple 
{
	@Test
	public void demo()
	{
		Reporter.log("signup", true);
	}
	
	@Test(dependsOnMethods="demo")
	public void sample()
	{
		Reporter.log("login", true);
	}
	
	@Test(dependsOnMethods="sample")
	public void simp()
	{
		Reporter.log("messages", true);
	}
}
