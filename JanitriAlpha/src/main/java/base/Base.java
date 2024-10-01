package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AppiumDriver<MobileElement> driver;
	public static final String PACKAGE_ID = "in.janitri.wardapp.daksh";

	 @Before
	public static AppiumDriver<MobileElement> setup() {

		System.out.println("Calling @beforetest");
		try {
			String userCurrDir = System.getProperty("user.dir");
			String appApkFilePath = "";

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
			caps.setCapability(MobileCapabilityType.UDID, "HA1NTNDG");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

			caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PACKAGE_ID);
			caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					"in.janitri.wardapp.ui.main.HomeScreenActivity");

			caps.setCapability(MobileCapabilityType.FULL_RESET, false);
			caps.setCapability(MobileCapabilityType.NO_RESET, true);
			caps.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, false);

			driver = new AppiumDriver<MobileElement>(caps);
			// driver = new AppiumDriver<>(url, caps);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		} catch (Exception exp) {
			System.out.println("Cause is :" + exp.getCause());
			System.out.println("Message is :" + exp.getMessage());
			exp.printStackTrace();
		}
		return driver;
	}
	 
	 public AppiumDriver<MobileElement> getDriver() {
		 
		 return driver;
		
	}

}
