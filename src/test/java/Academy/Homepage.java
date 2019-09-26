package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.Loginpage;
import Resources.Base;

public class Homepage extends Base{
	@Test(dataProvider="getdata")
	public void basePagenavigation(String username,String password) throws IOException
	{
		driver=InitializeDriver();
		driver.get("http://qaclickacademy.com");
		Landingpage l=new Landingpage(driver);
		l.getLogin().click();
		Loginpage lo=new Loginpage(driver);
		lo.getEmail().sendKeys(username);
		lo.getpassword().sendKeys(password);
		lo.getLoginbutton().click();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][]data=new Object[2][2];
		data[0][0]="nonstring@gmail.com";
		data[0][1]="1234";
		data[1][0]="sowjanya2@gmail.com";
		data[1][1]="fgtfs";

				return data;
				}

}
