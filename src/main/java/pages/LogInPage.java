package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    By signInButtonBy = By.linkText("Sign In");

    By emailFieldBy = By.id("email");

    By passwordFieldBy = By.id("pass");

    By signInButton2By = By.cssSelector("button[name='send'");

    public void performLogin (String email, String password) {
        clickElement(signInButtonBy);
        writeText(emailFieldBy, email);
        writeText(passwordFieldBy, password);
        clickElement(signInButton2By);
    }
    public void verifyFailedLogIn() {
        isElementDisplayed(signInButton2By);
    }
    public void verifyLogOut() {
        isElementDisplayed(signInButtonBy);
    }


}
