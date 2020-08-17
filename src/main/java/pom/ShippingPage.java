package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShippingPage extends BasePage {
    WebDriver driver;

    public ShippingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='firstName']")
    WebElement firstName;
    @FindBy(xpath = "//*[@id='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//*[@id='addressSuggestionOptOut']")
    WebElement enterAddress;
    @FindBy(xpath = "//*[@id='address1']")
    WebElement address;
    @FindBy(xpath = "//*[@id='email']")
    WebElement email;
    @FindBy(xpath = "//*[@id='phoneNumber']")
    WebElement mobile;
    @FindBy(xpath = "//*[@id='city']")
    WebElement city;
    @FindBy(xpath = "//*[@id='state']")
    WebElement state;
    @FindBy(xpath = "//*[@id='postalCode']")
    WebElement zipcode;
    @FindBy(xpath = "//*[@class='ncss-brand fs24-sm fs34-md u-uppercase']")
    WebElement validationStringElementThree;

    public void addressForshipping(String expectedString) throws InterruptedException {

        typeOnTextBox(firstName, "Shakib");
        typeOnTextBox(lastName, "Hassan");
        clickOnElement(enterAddress);
        typeOnTextBox(address, "5802 Arnet Street");
        typeOnTextBox(city, "Falls Church");
        selectState(state);
        typeOnTextBox(zipcode, "22041");
        typeOnTextBox(email, "sylhet202020@yahoo.com");
        typeOnTextBox(mobile, "3135642981");
        String validationString = validationStringElementThree.getText();
        Assert.assertEquals(validationString, expectedString);

    }

}
