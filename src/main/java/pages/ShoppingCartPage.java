package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    By removeButtonBy = By.linkText("Remove item");

    public void verifyItemInCart () {
        isElementDisplayed(removeButtonBy);
    }
}
