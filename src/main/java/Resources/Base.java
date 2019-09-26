package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;


public class Base

{
	public WebDriver driver;
	public WebDriver InitializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Laxmi Niroop\\Sowproject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
					//"C:\\Users\\Laxmi Niroop\\Downloads\\Selenium\\firefox\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if (browserName.equals("IE"))
		{
		}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	}
	

}
