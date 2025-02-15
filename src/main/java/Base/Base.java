package Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base {
	 protected static AppiumDriver<MobileElement> driver;

	    public void setup() throws MalformedURLException {
	        if (driver == null) {
	            DesiredCapabilities caps = new DesiredCapabilities();
	            caps.setCapability("platformName", "Android");
	            caps.setCapability("deviceName", "emulator-5554"); // Change for a real device
	            caps.setCapability("app", "C:\\Users\\HP\\Desktop\\app-release.apk");
	            caps.setCapability("automationName", "UiAutomator2");
	            caps.setCapability("unicodeKeyboard", true);
	            caps.setCapability("resetKeyboard", true);
	            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	        }
	    }

	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }

	    
}
