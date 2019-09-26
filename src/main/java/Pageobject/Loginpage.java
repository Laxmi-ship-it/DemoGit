package Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
By username=By.id("user_email");
By password=By.id("user_password");
By Login=By.cssSelector("input[type*='submit']");
public Loginpage(WebDriver driver) {
	this.driver=driver;
	// TODO Auto-generated constructor stub
}
public WebElement getEmail()
{
return driver.findElement(username);
}
public WebElement getpassword()
{
return driver.findElement(password);
}
public WebElement getLoginbutton()
{
	return driver.findElement(Login);
}
}
