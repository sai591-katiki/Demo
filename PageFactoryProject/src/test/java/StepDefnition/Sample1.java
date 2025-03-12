package StepDefnition;

import org.testng.Assert;

import Browser.Browser;
import Pages.Page1;
import Pages.Page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample1 {
	@Given("User openes the browser")
	public void user_openes_the_browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Browser.openBrowser();
	}

	@And("navigate to the {string} webpage")
	public void navigate_to_the_webpage(String string) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Browser.navigateToUrl(string);
	}

	@Then("user verifying the title of that webpage")
	public void user_verifying_the_title_of_that_webpage() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(Browser.getTitle(), "OrangeHRM");
	}
	

	@And("user close the browser")
	public void user_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		Browser.closeBrowser();
	   }
	

}
