package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalePage extends BasePage {

    public SalePage(WebDriver driver) {
        super(driver);
    }

    By jacketsSectionBy = By.linkText("Jackets");

    public void navigateToJackets() {
        clickElement(jacketsSectionBy);
    }
}
