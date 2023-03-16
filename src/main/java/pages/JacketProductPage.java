package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class JacketProductPage extends  BasePage{
    public JacketProductPage(WebDriver driver) {
        super(driver);
    }

    By reviewsButtonBy = By.id("tab-label-reviews-title");

    By reviewStarBy =  By.id("Rating_1_label");

    By nicknameFieldBy = By.id("nickname_field");

    By summaryFieldBy = By.id("summary_field");

    By reviewFieldBy = By.id("review_field");

    By submitButtonBy = By.xpath("(//button[@type='submit'])[2]");


public void writeReview(String nick, String summary, String review) {
    clickElement(reviewsButtonBy);
    clickElement(reviewStarBy);
    writeText(nicknameFieldBy, "nick");
    writeText(summaryFieldBy,"summary");
    writeText(reviewFieldBy, "review");
    clickElement(submitButtonBy);
}


}
