package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='nav-brand fs16-nav-sm prl5-sm pt6-sm pb6-sm nav-uppercase d-sm-ib va-sm-m'])[2]")
    WebElement men;
    @FindBy(xpath = "(//*[@class='JSftBPEZ'])[1]")
    WebElement shoes;
    @FindBy(xpath = "(//*[@class='css-hrsjq4 css-xhk1pl css-1t2ydyg categories__item  is--link'])[1]")
    WebElement lifestyle;
    @FindBy(xpath = "//*[@src='https://static.nike.com/a/images/c_limit,w_318,f_auto/t_product_v1/i1-718b0e6f-b52d-45aa-ae62-7b99e4a9348e/air-force-1-07-lv8-mens-shoe-Gfcq5W.jpg']")
    WebElement airForce;
    @FindBy(xpath = "(//*[@class='css-xf3ahq'])[13]")
    WebElement size;

    public void toBuy(String expectedString) throws InterruptedException {

        clickOnElement(men);
        System.out.println("clicked on MEN");
        clickOnElement(shoes);
        clickOnElement(lifestyle);
        clickOnElement(airForce);
        System.out.println("clicked on Air Force");
        clickOnElement(size);
        Thread.sleep(2000);

    }
}