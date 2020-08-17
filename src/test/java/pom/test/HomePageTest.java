package pom.test;

import org.testng.annotations.Test;

public class HomePageTest extends BasePageTest {

    @Test(priority = 1)
    public void testOne() throws InterruptedException {

        homePage.toBuy("");
    }

    @Test(priority = 2)

    public void testTwo() throws InterruptedException {
        cartPage.iteamViewOnCart("Summary");

    }

    @Test(priority = 3)

    public void testThree() throws InterruptedException {
        loginPage.loginAccount("Shakib Hassan");

    }

    @Test(priority = 4)
    public void testFour() throws InterruptedException {
        shippingPage.addressForshipping("CHECKOUT");

    }

    @Test(priority = 5)
    public void testFive() throws InterruptedException {
        memberProfilePage.memberProfile("Shakib Hassan");

    }

}
