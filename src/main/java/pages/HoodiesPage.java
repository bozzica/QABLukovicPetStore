package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HoodiesPage extends BasePage{
    public HoodiesPage(WebDriver driver) {
        super(driver);
    }
    By productHoodieButtonBy = By.linkText("Circe Hooded Ice Fleece");

    public void navigateToHoodieProduct() {
        clickElement(productHoodieButtonBy);
    }

}
