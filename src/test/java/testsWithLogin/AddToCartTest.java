package testsWithLogin;

import org.testng.annotations.Test;
import pages.*;

@Test
public class AddToCartTest extends BaseTestWithLogin {
    public void removeFromCart () {
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToWomenPage();
        WomenPage womenPage = new WomenPage(driver);
        womenPage.navigateToHoodies();
        HoodiesPage hoodiesPage = new HoodiesPage(driver);
        hoodiesPage.navigateToHoodieProduct();
        HoodieProductPage productPage = new HoodieProductPage(driver);
        productPage.addToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.verifyItemInCart();



    }
}
