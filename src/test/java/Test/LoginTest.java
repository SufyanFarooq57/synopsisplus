package Test;

import java.net.MalformedURLException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Page.Login;
import Base.Base;

public class LoginTest extends Base {
	private Login login;  // Page Object reference

    @BeforeMethod
    public void setup() throws MalformedURLException {
        super.setup();  // Ensures driver is initialized in Base class
        login = new Login(driver);  // Pass driver to Page Object
    }

    @Test
    public void testLogin() {
    	 String username = "sufyan@gmail.com";
         String password = "password123";

         System.out.println("Entered username: " + username);
         System.out.println("Entered password: " + password);

         login.enterUsername(username);
         login.enterPassword(password);
         login.clickLoginButton();
         
    }
   
    @Test
    public void sbtn() {
    	login.clickSignupButton();
    }
    

}
