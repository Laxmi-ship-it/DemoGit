package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalhomepage {
public WebDriver driver;
By searchBox=By.name("query");
 public portalhomepage(WebDriver driver)
 {
	 this.driver=driver;
 }
public WebElement getsearchbox()
{
	return driver.findElement(searchBox);
}
}
