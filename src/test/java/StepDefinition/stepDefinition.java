package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.runner.RunWith;

import Pageobject.Landingpage;
import Pageobject.Loginpage;
import Pageobject.portalhomepage;
import Resources.Base;

@RunWith(Cucumber.class)
public class stepDefinition extends Base {

	@Given("^Initilize the browser with chrome$")
	public void initilize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=InitializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on Secure sing in page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sing_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	
	Landingpage l=new Landingpage(driver);
	if(l.popupsize()>0)
	{
		l.popup().click();
	}
		l.getLogin().click();

	}


	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   portalhomepage po=new portalhomepage(driver);
	   Assert.assertTrue(po.getsearchbox().isDisplayed());
	} 
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
 // Write code here that turns the phrase above into concrete actions
 
		Loginpage lo=new Loginpage(driver);
		lo.getEmail().sendKeys(username);
		lo.getpassword().sendKeys(password);
		lo.getLoginbutton().click();
	
	}
	}
