package testsWithLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LogInPage;
import utilities.PropertyManager;

public class BaseTestWithLogin {

        public WebDriver driver;

        @BeforeMethod

        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
            driver.get(PropertyManager.getInstance().getUrl());
            LogInPage logInPage = new LogInPage(driver);
            logInPage.performLogin(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());

        }

        @AfterMethod

        public void tearDown () {
            driver.close();
        }
}

