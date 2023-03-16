package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JacketsOnSalePage extends BasePage {
    public JacketsOnSalePage(WebDriver driver) {
        super(driver);
    }

    By productJacketButtonBy = By.linkText("Olivia 1/4 Zip Light Jacket");

    public void navigateToProductJacket () {
        clickElement(productJacketButtonBy);
    }
}
