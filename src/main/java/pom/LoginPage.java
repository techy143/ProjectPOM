package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath = "//*[@data-automation='go-to-checkout-button']")
    @FindBy(xpath = "(//*[@class='css-hj4k3g e1qel1sl4'])[1]")

    WebElement checkout;
    @FindBy(xpath = "//*[@type='email']")
    WebElement id;
    @FindBy(xpath = "//*[@type='password']")
    WebElement password;


    @FindBy(xpath = "(//*[@type='button'])[2]")
    WebElement memberCheckOut;
    @FindBy(xpath = "//*[@class='test-name text-color-grey ml2-sm va-sm-m d-sm-h d-md-ib']")
    WebElement validationStringElementTwo;

    public void loginAccount(String expectedString) throws InterruptedException {

        clickOnElement(checkout);
        System.out.println("clicked on checkout");
        typeOnTextBox(id, "sylhet202020@yahoo.com");
        typeOnTextBox(password, "Dhaka123");
        clickOnElement(memberCheckOut);
        Thread.sleep(2000);
        String validationString = validationStringElementTwo.getText();
        Assert.assertEquals(validationString, expectedString);
        Thread.sleep(2000);

    }
}
