package Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Base;

public class Landingpage {
	
public WebDriver driver;
By signin= By.cssSelector("a[href*='sign_in']");
By Title=By.xpath("//div[@class='text-center']/h2");
By popup=By.xpath("//button[text()='NO THANKS']");
public Landingpage(WebDriver driver) {
	this.driver=driver;
}

public WebElement getLogin()
{
	return driver.findElement(signin);
}
public WebElement getTitle()
{
	return driver.findElement(Title);
}
public int popupsize()
{
return driver.findElements(popup).size();
}
public WebElement popup()
{
return driver.findElement(popup);
}
}

