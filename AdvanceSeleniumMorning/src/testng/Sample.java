package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample 
{
	@Test(enabled=true)
	public void test()
	{
		Reporter.log("1", true);
	}
	
	@Test(enabled=true)
	public void test1()
	{
		Reporter.log("2", true);
	}
	
	@Test(enabled=false)
	public void test2()
	{
		Reporter.log("3", true);
	}
	
}
