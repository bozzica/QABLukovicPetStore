package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HoodieProductPage extends BasePage {

    public HoodieProductPage(WebDriver driver) {
        super(driver);
    }

    By sizeButtonBy = By.id("option-label-size-143-item-166");

    By colorButtonBy = By.id("option-label-color-93-item-52");

    By addToCartButtonBy = By.id("product-addtocart-button");

    By cartButtonBy = By.cssSelector("div[data-block='minicart']");

    By viewCartButtonBy = By.linkText("View and Edit Cart");

    public void addToCart() {
        clickElement(sizeButtonBy);
        clickElement(colorButtonBy);
        clickElement(addToCartButtonBy);
        clickElement(cartButtonBy);
        clickElement(viewCartButtonBy);
    }


}
