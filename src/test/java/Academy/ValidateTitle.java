package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.Loginpage;
import Resources.Base;
import junit.framework.Assert;

public class ValidateTitle extends Base{
	@Test
	public void basePagenavigation() throws IOException
	{
		driver=InitializeDriver();
		driver.get("http://qaclickacademy.com");
		Landingpage l=new Landingpage(driver);
		//l.getLogin().click();
		System.out.println(l.getTitle().getText());
		Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES123");
	}
}
