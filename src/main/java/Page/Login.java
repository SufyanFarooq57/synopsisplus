package Page;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login {

    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
    private MobileElement usernameField;

    // Password field
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
    private MobileElement passwordField;

    // Login button
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Log in\"]")
    private MobileElement loginButton;

    // "Don't have an account?" text
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Don't have an account? \"]")
    private MobileElement textElement;

    // Sign-up button
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign up\"]")
    private MobileElement signupButton;

    private final AppiumDriver<MobileElement> driver;

    public Login(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); // Initialize @AndroidFindBy annotations
    }

    public void enterUsername(String username) {
        usernameField.click();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
    }

    
    
    public void clickLoginButton() {
        loginButton.click();
    }

    public String getDisplayedText() {
        return textElement.getText();
    }

    public void clickSignupButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(signupButton)); // Wait for visibility
        signupButton.click();
    }
    
}
