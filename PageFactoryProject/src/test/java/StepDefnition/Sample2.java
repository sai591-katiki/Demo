package StepDefnition;

import Pages.Page1;
import Pages.Page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample2 {
	@When("user enters {string} username")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    Page1.userNameEnter(string);
	}

	@And("user enteres {string} password")
	public void user_enteres_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    Page1.passwordEnter(string);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    Page1.login();
	}
	@Then("user verifies the username")
	public void user_verifies_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	   Page2.getUser();
	}


}
