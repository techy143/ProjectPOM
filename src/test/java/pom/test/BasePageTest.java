package pom.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pom.*;

import java.util.concurrent.TimeUnit;

public class BasePageTest {

    public WebDriver driver;

    public HomePage homePage;
    public CartPage cartPage;
    public LoginPage loginPage;
    public ShippingPage shippingPage;
    public MemberProfilePage memberProfilePage;


    @BeforeClass
    public void setUpMethod() {
        initilization();
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        loginPage = new LoginPage(driver);
        shippingPage = new ShippingPage(driver);
        memberProfilePage = new MemberProfilePage(driver);

    }

    public void initilization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.nike.com/");

    }

    @AfterClass
    public void tearDownMethod() {

        if (driver != null) {
            driver.quit();
        }
    }
}