package testsWithLogin;

import org.testng.annotations.Test;
import pages.JacketProductPage;
import pages.JacketsOnSalePage;
import pages.SalePage;
import pages.UserLoggedInPage;

@Test
public class ReviewProductTest extends BaseTestWithLogin{
    public void reviewProduct() {
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToSalePage();
        SalePage salePage = new SalePage(driver);
        salePage.navigateToJackets();
        JacketsOnSalePage jacketsOnSalePage= new JacketsOnSalePage(driver);
        jacketsOnSalePage.navigateToProductJacket();
        JacketProductPage jacketProductPage = new JacketProductPage(driver);
        jacketProductPage.writeReview("Boki", "Jacket not good", "It fell apart after first washing");

    }
}
