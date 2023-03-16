package pages;

import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void clickElement(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void clickRandomElement(WebElement webElement) {
        webElement.click();

    }

    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
    public void assertStringEquals(String expectedText, String actualText) {
        Assert.assertEquals(expectedText, actualText);

    }

    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public boolean isElementNotDisplayed(By elementBy) {
        if (driver.findElements(elementBy).size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void isElementDisplayed(By elementBy){
        Assert.assertTrue(driver.findElement(elementBy).isDisplayed());}

    public WebElement selectRandomWebElement (By elementBy) {
        List <WebElement> webElementList = driver.findElements(elementBy);
        Random random = new Random();
        int size = webElementList.size();
        int selection = random.nextInt(-1);
        return  webElementList.get(selection);


    }


}
