package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage {
    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }
    By signInButtonBy = By.linkText("Sign In");

    By womenButtonBy = By.id("ui-id-4");

    By hoodiesSectionBy = By.linkText("Hoodies & Sweatshirts");

    By productButtonBy = By.linkText("Circe Hooded Ice Fleece");

    By customerMenuButtonBy = By.xpath("(//button[@type='button'])[1]");

    By signOutButtonBy = By.linkText("Sign Out");

    By saleSectionBy = By.linkText("Sale");

    public void verifyLogin ()  {
        isElementNotDisplayed(signInButtonBy);

    }
    public void navigateToWomenPage () {
        clickElement(womenButtonBy);
    }
    public void performLogout() {
        clickElement(customerMenuButtonBy);
        clickElement(signOutButtonBy);
    }
    public void navigateToSalePage(){
        clickElement(saleSectionBy);
    }

}
