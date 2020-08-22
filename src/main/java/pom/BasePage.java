package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    //This method clicks on elements
    public void clickOnElement(WebElement element) {

        element.click();
    }

    //This method types a String a textBox
    public void typeOnTextBox(WebElement element, String textToBeEntered) {

        element.sendKeys(textToBeEntered);

    }

    //This method is for checking a checkbox
    public void clickOnCheckbox(WebElement element) {

        element.click();
    }

    // Select method

    public void selectState(WebElement element) {
        Select select = new Select(element);
        select.selectByVisibleText("Virginia");
    }
}