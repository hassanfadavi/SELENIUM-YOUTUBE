package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.practice_BDD.PracticeLandingPage;
import pages.practice_BDD.PracticeLoginPage;

import utils.WaitUtils;

public class TestFunction extends BaseTest {


    PracticeLandingPage nopLandingPage;
    PracticeLoginPage nopLoginPage;

    @Test
    public void test(){

        this.nopLandingPage=new PracticeLandingPage(driver);
        WaitUtils.applyGlobalWait();
        nopLandingPage.clickOnLogin();
        WaitUtils.applyGlobalWait();

        this.nopLoginPage=new PracticeLoginPage(driver);
//        nopLoginPage.enterEmail("hassan2@gmail.com");
//        nopLoginPage.enterpass("Test2@selenium");
        WaitUtils.applyGlobalWait();
        nopLoginPage.clickOnLoginButton();
        WaitUtils.applyGlobalWait();
//       String text=driver.findElement(By.xpath("//ul[@class='woocommerce-error']/li/strong")).getText();
//        System.out.println("texttttttttttttttttt"+text);
//        nopLoginPage.verifyLogin.getText();
//        this.nopLoginPage=new PracticeLoginPage(driver);


        nopLoginPage.verifyLogin();



    }


}
