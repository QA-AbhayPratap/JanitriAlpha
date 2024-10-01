package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Indide steps: User is inside login page");
	}

	@When("User  enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("Indide steps: user is entering valid username and valid password");
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		System.out.println("Indide steps: User click on Signin button");
	}

	@Then("User is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		System.out.println("Indide steps: User is on application's home page");
	}

}
