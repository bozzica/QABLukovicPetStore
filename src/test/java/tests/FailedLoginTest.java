package tests;

import org.testng.annotations.Test;
import pages.LogInPage;
import utilities.PropertyManager;

@Test
public class FailedLoginTest extends BaseTest {
    public void emptyEmailTest () {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.performLogin("", PropertyManager.getInstance().getValidPassword());
        logInPage.verifyFailedLogIn();
    }
    public void emptyPasswordTest() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.performLogin(PropertyManager.getInstance().getValidEmail(), "");
        logInPage.verifyFailedLogIn();
    }

    public void emptyCredentialsTest () {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.performLogin(PropertyManager.instance.getInvalidEmail(), PropertyManager.instance.getInvalidPassword());
        logInPage.verifyFailedLogIn();
    }
}
