package tests;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

@Test

public class ValidLoginTest extends BaseTest {
    public void validLoginTest () {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.performLogin(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.verifyLogin();



    }
}
