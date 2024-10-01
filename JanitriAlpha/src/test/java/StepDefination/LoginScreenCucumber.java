package StepDefination;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import pages.login.LoginPageCucumber;
import utils.utility;

public class LoginScreenCucumber extends Base {

	LoginPageCucumber loginpage = new LoginPageCucumber(driver);
	
	@Given("User is on login screen")
	public void user_is_on_login_screen() {
		System.out.println("Step Inside: user_is_on_login_screen");

	}

	
	@Given("Validating the application name")
	@Step("Check app name on login screen")  //done
	public void validating_the_application_name() throws InterruptedException {
		System.out.println("Step Inside: validating_the_application_name");
		loginpage.velidateAppName();
	}
	@Given("Sing in text is displaying")
	public void sing_in_text_is_displaying() {
		loginpage.singinText1 ();
	}

	@Given("Sing Up button is displaying")
	public void sing_up_button_is_displaying() {
		loginpage.signInButton();
		//Check krna hai.
	}

	@When("Application tag line is display and its spelling")
	public void application_tag_line_is_display() throws InterruptedException {
		loginpage.applicationTagLine();
		
	}

	@When("User ID text is display")
	public void user_id_text_is_display() throws InterruptedException {
		loginpage.userIdText();
		
	}

	@Step("By clicking on password eye button text is visible or not")
	@When("Password text is display")
	public void password_text_is_display() throws InterruptedException {
		loginpage.passwordEyeButtonFunction();
	}

	@When("Eye button is display")
	public void eye_button_is_display() {
		
	}

	@When("Signin button is display")
	public void signin_button_is_display() {
	}

	@When("Bottom bar line is  display")
	public void bottom_bar_line_is_display() {
	}

	@Then("Hyper link is display on footer")
	public void hyper_link_is_display_on_footer() {
	}

}
