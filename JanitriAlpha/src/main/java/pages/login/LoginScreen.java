package pages.login;

import static org.testng.Assert.assertEquals;

import java.security.PublicKey;
import java.time.chrono.ChronoLocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import utils.utility;

public class LoginScreen extends Base {

	//LoginScreenLocators locators = new LoginScreenLocators(driver);
	
//	@Step("Login the application with invalid credential \n Testing that toast msg is comming or not.")
//	public void loginInvalidCred() throws InterruptedException {
//	locators.userIdField.click();
//	locators.userIdField.clear();
//	driver.getKeyboard().sendKeys("invalid.credential@abhay.pratap");
//	utils.sleep();
//	locators.passwordField.click();
//	locators.passwordField.clear();
//	driver.getKeyboard().sendKeys("InVaLiD@CrEd");
//	utils.sleep();
//	locators.signInButton.click();
//	String toastMsg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//	System.out.println("Print toast msg:- "+ toastMsg);
//	Assert.assertEquals(toastMsg,"Username / Password entered is incorrect");
//		
//	}

//	@Step("By clicking on password eye button text is visible or not")
//	public void passwordEyeButtonFunction() throws InterruptedException {
//
//		locators.passwordField.click();
//
//		System.out.println("Checking password masked");
//		Assert.assertEquals(String.valueOf(locators.passwordField.getAttribute("password")), "true");
//
//		locators.eyeButton.click();
//		utils.sleep();
//
//		System.out.println("Checking password unmasked");
//		Assert.assertEquals(String.valueOf(locators.passwordField.getAttribute("password")), "false");
//
//	}
	
//	@Step("SignIn button is displaying or not")
//	public void isSignInButtonDisplay() {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.signInButton));
//	}

//	@Step("Sign In button spelling")
//	public void singInButtonSpell() throws InterruptedException {
//		Assert.assertEquals(locators.signInButton.getText(), "Sign in");
//		utils.sleep();
//	}

//	@Step("Eye button is displaying or not")
//	public void isEyeButtonDisplay() {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.eyeButton));
//	}

//	@Step("Checking spelling of each words in hyper link")
//	public void hyperLinkSpell() throws InterruptedException {
//		Assert.assertEquals(locators.hyperLink.getText(), "https://www.janitri.in/terms-and-condition");
//		utils.sleep();
//	}

//	@Step("Ckeck hyper link is display or not")
//	public void isHyperLinkDisplay() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.hyperLink));
//
//	}

//	@Step("Login the application with valid credential")
//	public void logInApp() throws InterruptedException {
//		locators.userIdField.click();
//		locators.userIdField.clear();
//		driver.getKeyboard().sendKeys("doctor.abhay@daksh.live");
//		Thread.sleep(2000);
//		locators.passwordField.click();
//		locators.passwordField.clear();
//		driver.getKeyboard().sendKeys("test");
//		Thread.sleep(2000);
//		locators.signInButton.click();
//
//	}

//	@Step("Validating each word spelling in below text field")
//	public void belowTextSpel() throws InterruptedException {
//		Assert.assertEquals(locators.belowTextLine.getText(), "By using this application you agree to our Terms and Conditions mentioned at");
//		Thread.sleep(2000);
//	}

//	@Step("Validating that below text line is displaying")
//	public void belowText() {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.belowTextLine));
//	}

//	@Step("Valadating the each words spelling in tabline")
//	public void tagLineSpel() throws InterruptedException {
//		Assert.assertEquals(locators.tagLine.getText(), "New age labor monitoring tool");
//		Thread.sleep(2000);
//	}

//	@Step("Validating that tag line is displying or not")
//	public void tagLingDisplay() {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.tagLine));
//	}

//	@Step("Valaditing spelling of SignUp button")
//	public void singUpSpel() throws InterruptedException {
//		Thread.sleep(2000);
//		Assert.assertEquals(locators.SignUp.getText(), "Sign Up");
//	}

//	@Step("Validating that Sing up text displaying")
//	public void singUp() {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.SignUp));
//	}

//	@Step("Validating spelling of Sign in ")
//	public void signInSpel() throws InterruptedException {
//		Thread.sleep(2000);
//		Assert.assertEquals(locators.SignInSpel.getText(), "Sign in");
//	}

//	@Step("Validating Sing In Text is displaying")
//	public void singInText() {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.singInText));
//	}

//	@Step("Check app name on login screen")
//	public void checkAppName() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(locators.appName));
//
//		System.out.println("app name is - " + locators.appName.getText());
//	}

//	@Step("Verifing that Username or UserID is displaying")
//	public void checkUserID() throws InterruptedException {
//		Thread.sleep(2000);
//		Assert.assertEquals(locators.userID.getText(), "User ID");
//
//		System.out.println("Texet writen in userid field: " + locators.userID.getText());
//	}

//	@Step("Check Password is displaying on login scereen")
//	public void checkPasswordField(AppiumDriver<MobileElement> driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(locators.password));
//
//		System.out.println("Password filed id " + locators.password.getText());
//	}
}
