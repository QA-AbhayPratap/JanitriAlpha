package apptest;

import org.testng.annotations.Test;

import java.security.PublicKey;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.AllureTestNg;
import pages.login.LoginScreen;
import pages.login.LoginScreenLocators;
import utils.utility;

@Listeners({ AllureTestNg.class })
@Owner("QA Abhay")
public class LoginTest extends Base {

//	LoginScreen loginScreen;
//
//	@Test(priority = 1)
//	@Feature("Login Feature")
//	@Description("Validating application name")
//	public void checkAppNameSpelling() throws InterruptedException {
//		loginScreen = new LoginScreen();
//		Thread.sleep(5000);
//		loginScreen.checkAppName();
//
//	}
//
//	@Test(priority = 2)
//	@Feature("Login Feature")
//	@Description("Validating UserID is displaying")
//	public void isUserNameDisplayed() throws InterruptedException {
//		loginScreen.checkUserID();
//		Thread.sleep(2000);
//	}
//
//	@Test(priority = 3)
//	@Feature("Login Feature")
//	@Description("Password field is preset in login screen")
//	public void isPasswordFieldDisplayed() throws InterruptedException {
//		loginScreen.checkPasswordField(driver);
//		utils.sleep();
//	}
//
//	@Test(priority = 4)
//	@Feature("Login Feature")
//	@Description("Verify that SingIn Text is displaying or note, \n Testing that SingIn Text is visible on login screen or not")
//	public void checkSignInToolbarDisplayed() throws InterruptedException {
//		loginScreen.singInText();
//		utils.sleep();
//	}
//
//	@Test(priority = 5)
//	@Feature("Login Feature")
//	@Description("Verifing that spelling of Sing in, \n In login screen Spelling is Sign in")
//	public void checkSignInToolbarSpell() throws InterruptedException {
//		loginScreen.signInSpel();
//		utils.sleep();
//	}
//
//	@Test(priority = 6)
//	@Feature("Login Feature")
//	@Description("Verify that Application tagLingDisplay, \n Below application name verifying that its tagline is display or not")
//	public void isTagLineDisplay() throws InterruptedException {
//		loginScreen.tagLingDisplay();
//		utils.sleep();
//	}
//
//	@Test(priority = 7)
//	@Feature("Login Feature")
//	@Description("Verifying the spelling of each word present in tag line, \n Below application name verifying that its spelling")
//	public void cheeckTagLineSpell() throws InterruptedException {
//		loginScreen.tagLineSpel();
//		utils.sleep();
//	}
//
//	@Test(priority = 8)
//	@Feature("Login Feature")
//	@Description("Verifing the spelling of each word in T&C line ")
//	public void tnCLineSpell() throws InterruptedException {
//		loginScreen.belowTextSpel();
//	}
//
//	@Test(priority = 9)
//	@Feature("Login Feature")
//	@Description("Verify T&C line is display or not ")
//	public void TnCLine() {
//		loginScreen.belowText();
//	}
//
//	@Test(priority = 10)
//	@Feature("Login Feature")
//	@Description("Eye button is displaying or not")
//	public void isEyeButtonDisplay() {
//		loginScreen.isEyeButtonDisplay();
//	}
//
//	@Test(priority = 11)
//	@Feature("Login Feature")
//	@Description("Sign In button spelling")
//	public void signInButtonSpell() throws InterruptedException {
//		loginScreen.singInButtonSpell();
//		
//	}
//	private void navam() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Test(priority = 12)
//	@Feature("Login Feature")
//	@Description("SignIn button is displaying or not")
//	public void isSignInButtonDisplay() {
//		loginScreen.isSignInButtonDisplay();
//	}
//	
//	@Test(priority = 13)
//	@Feature("Longin Feature")
//	@Description("By clicking on password eye button text is visible or not")
//	public void passwordEyeButtonFunctionality() throws InterruptedException {
//		loginScreen.passwordEyeButtonFunction();
//	}
//	
//	@Test(priority = 14)
//	@Feature("Login Feature")
//	@Description("Login the application with invalid credential \\n Testing that toast msg is comming or not.\"")
//	public void invalidCred() throws InterruptedException {
//		loginScreen.loginInvalidCred();
//		
//	}
//	@Test(priority = 14)
//	@Feature("Login Feature")
//	@Description("Testing login funcality with valid credential, \n Testing LogIn feature")
//
//	public void loginWithValidCredentials() throws InterruptedException {
//		loginScreen.logInApp();
//		utils.sleep();
//
//	}

}
