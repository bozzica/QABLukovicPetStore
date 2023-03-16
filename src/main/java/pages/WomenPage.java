package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage extends BasePage
{
    public WomenPage(WebDriver driver) {
        super(driver);
    }
    By hoodiesSectionBy = By.linkText("Hoodies & Sweatshirts");

    public void navigateToHoodies () {
        clickElement(hoodiesSectionBy);
    }

}
