package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataAcceptorClass 
{
	@Test(dataProvider="LoginData", dataProviderClass=DataProviderClass.class)
	public void accept(String user,String pwd)
	{
		System.out.println(user+"   "+pwd);
	}
}
