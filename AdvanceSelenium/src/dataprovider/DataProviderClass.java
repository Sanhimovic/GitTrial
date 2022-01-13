package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="LoginData")
	public static Object[][] data()
	{
		Object[][] logdata={{"yo@gmail.com","yosan"},{"san@gmail.com","sanyog"}};
		return logdata;
	}
}
