package testsWithLogin;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

@Test
public class LogoutTest extends BaseTestWithLogin {
    public void logoutTest() {
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.performLogout();
        LogInPage logInPage = new LogInPage(driver);
        logInPage.verifyLogOut();


    }

}
