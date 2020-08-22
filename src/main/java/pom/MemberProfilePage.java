package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MemberProfilePage extends BasePage {
    WebDriver driver;

    public MemberProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='test-name text-color-grey ml2-sm va-sm-m d-sm-h d-md-ib']")
    WebElement memberHomepage;
    @FindBy(xpath = "//*[@id=\"MyAccountLink\"]/span")
    WebElement myAccount;
    @FindBy(xpath = "//*[@class='headline-1 mex-header-title']")
    WebElement validationStringElementFour;

    public void memberProfile(String expectedString) throws InterruptedException {
        clickOnElement(memberHomepage);
        clickOnElement(myAccount);
        String validationString = validationStringElementFour.getText();
        Assert.assertEquals(validationString, expectedString);


    }
}