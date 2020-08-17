package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends BasePage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='ncss-btn-primary-dark btn-lg css-y0myut add-to-cart-btn'])[1]")
    WebElement addtoCart;
    @FindBy(xpath = "(//*[@class='g72-cart cart-icon'])[1]")
    WebElement viewCart;
    @FindBy(xpath = "//*[@class='css-1qpkbz8 e181ly3q3']")
    WebElement validationStringElementOne;

    public void iteamViewOnCart(String expectedString) throws InterruptedException {

        clickOnElement(addtoCart);
        Thread.sleep(4000);
        clickOnElement(viewCart);
        System.out.println("Cart Viewed");

        String validationString = validationStringElementOne.getText();
        Assert.assertEquals(validationString, expectedString);
        Thread.sleep(1000);

    }

}

