package pages.login;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import utils.utility;

public class LoginPageCucumber {
	
	private AppiumDriver<MobileElement> driver;


	
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sign in\"]")
	MobileElement SignInSpel;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"in.janitri.wardapp.daksh:id/passwordEditText\"]")
	MobileElement passwordField;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"in.janitri.wardapp.daksh:id/emailEditText\"]")
	MobileElement userIdField;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"in.janitri.wardapp.daksh:id/textView\"]")
	MobileElement applicationName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sign in\"]")
	MobileElement signin_font;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"in.janitri.wardapp.daksh:id/signup_imageview\"]")
	MobileElement signUp_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"in.janitri.wardapp.daksh:id/textView2\"]")
	MobileElement application_tagline;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"User ID\"]")
	MobileElement userID_txt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Password\"]")
	MobileElement password_txt;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Show password\"]")
	MobileElement eye_Btn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"in.janitri.wardapp.daksh:id/loginButton\"]")
	MobileElement signIn_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"in.janitri.wardapp.daksh:id/textView3\"]")
	MobileElement bottom_bar_line;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"in.janitri.wardapp.daksh:id/termsAndConditionsTextView\"]")
	MobileElement hyperLink;

	
public LoginPageCucumber(AppiumDriver<MobileElement> driver) {
		
		this.driver = driver;
		System.out.println("driver value - " + driver == null);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		// PageFactory.initElements(driver, LoginScreenLocators.class);
	}
	
	
//	@Step("Check application name on login screen is displayin")
	public void checkAppName() {
		applicationName.isDisplayed();

	}
	
//	@Step("Sing in text is displaying")
	public void singInText() {
		signin_font.isDisplayed();
	}
//	@Step("Sing Up button is displaying")
	public void singUpButton() {
		signUp_btn.isDisplayed();
	}
//	@Step("Application tag line is display")
	public void appTagLine() {
		application_tagline.isDisplayed();
	}
	
//	@Step("User ID text is display")
	public void userIdTextc() {
		userID_txt.isDisplayed();
	}
	
//	@Step("Password text is display")
	public void password() {
		password_txt.isDisplayed();
	}
	
	@Step("Eye button is display")
	public void eyeButton() {
		eye_Btn.isDisplayed();
	}
	
	
	@Step("Bottom bar line is  display")
	public void bottomLine() {
		bottom_bar_line.isDisplayed();
	}
	@Step("Hyper link is display on footer")
	public void hyperLink() {
		hyperLink.isDisplayed();
	}
	
	//____________________Below code is copy past from LoginScreen class with small changes______________
	
	@Step("Valaditing spelling of SignUp button")
	public void singUpSpel() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(signUp_btn.getText(), "Sign Up");
	}
	
	@Step("Signin button is display") // done
	public void signInButton() {
//		signIn_btn.isDisplayed();
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(signIn_btn));
	}
	
	@Step("Sign In button spelling")
	public void singInButtonSpell() throws InterruptedException {
		Assert.assertEquals(SignInSpel.getText(), "Sign in");
		utility.sleep();
	}
	
	@Step("Eye button is displaying or not")
	public void isEyeButtonDisplay() {
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(eye_Btn));
	}
	@Step("Checking spelling of each words in hyper link")
	public void hyperLinkSpell() throws InterruptedException {
		Assert.assertEquals(hyperLink.getText(), "https://www.janitri.in/terms-and-condition");
		utility.sleep();
	}
	
	@Step("Ckeck hyper link is display or not")
	public void isHyperLinkDisplay() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(hyperLink));

	}
	

	
	@Step("Validating each word spelling in below text field")
	public void belowTextSpel() throws InterruptedException {
		Assert.assertEquals(bottom_bar_line.getText(), "By using this application you agree to our Terms and Conditions mentioned at");
		Thread.sleep(2000);
	}
	
	@Step("Validating that below text line is displaying")
	public void belowText() {
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(bottom_bar_line));
	}
	
	@Step("Valadating the each words spelling in tagline and Validating that tag line is displying or not") // done
	public void applicationTagLine () throws InterruptedException {
		Assert.assertEquals(application_tagline.getText(), "New age labor monitoring tool");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(application_tagline));
	} 
	//done
	
	
	@Step("Validating that Sing up text displaying and Validating spelling of Sign in ")
	public void singUp() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(signUp_btn));
		Thread.sleep(2000);
		Assert.assertEquals(SignInSpel.getText(), "Sign in");
	}
	//Done
	
	
	
	@Step("Validating Sing In Text is displaying")  // done
	public void singinText1 () {
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(signin_font));
	}
	
	// @Step("Check app name on login screen")  //done
	public void velidateAppName() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(applicationName));

	}
	
	@Step("Verifing that Username or UserID is displaying")
	public void userIdText() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(userID_txt.getText(), "User ID");
		System.out.println("Texet writen in userid field: " + userID_txt.getText());
	}
	//done
	
	@Step("Check Password is displaying on login scereen")
	public void passwordTxt(AppiumDriver<MobileElement> driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(password_txt));
		System.out.println("Password filed id " + password_txt.getText());
	}
	//Done
	
	
	@Step("Login the application with invalid credential \n Testing that toast msg is comming or not.")
	public void loginInvalidCred() throws InterruptedException {
	userIdField.click();
	userIdField.clear();
	driver.getKeyboard().sendKeys("invalid.credential@abhay.pratap");
	utility.sleep();
	passwordField.click();
	passwordField.clear();
	driver.getKeyboard().sendKeys("InVaLiD@CrEd");
	utility.sleep();
	signIn_btn.click();
	String toastMsg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
	System.out.println("Print toast msg:- "+ toastMsg);
	Assert.assertEquals(toastMsg,"Username / Password entered is incorrect");
		
	}
	
	@Step("By clicking on password eye button text is visible or not")
	public void passwordEyeButtonFunction() throws InterruptedException {

		passwordField.click();

		System.out.println("Checking password masked");
		Assert.assertEquals(String.valueOf(passwordField.getAttribute("password")), "true");

		eye_Btn.click();
		utility.sleep();

		System.out.println("Checking password unmasked");
		Assert.assertEquals(String.valueOf(passwordField.getAttribute("password")), "false");

	}
	
	@Step("Login the application with valid credential")
	public void logInApp() throws InterruptedException {
		userIdField.click();
		userIdField.clear();
		driver.getKeyboard().sendKeys("doctor.abhay@daksh.live");
		Thread.sleep(2000);
		passwordField.click();
		passwordField.clear();
		driver.getKeyboard().sendKeys("test");
		Thread.sleep(2000);
		signIn_btn.click();

	}

}
