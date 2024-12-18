package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.practice_BDD.practiceLandingPage;
import pages.practice_BDD.practiceLoginPage;
import utils.WaitUtils;

public class TestFunction extends BaseTest {




    @Test
    public void test(){

        practiceLandingPage nopLandingPage=new practiceLandingPage(driver);



        WaitUtils.applyGlobalWait();
        nopLandingPage.clickOnLogin();
        WaitUtils.applyGlobalWait();
        practiceLoginPage nopLoginPage=new practiceLoginPage(driver);
        nopLoginPage.enterEmail("hassan@gmail.com");
        nopLoginPage.enterpass("Test@selenium");
        nopLoginPage.clickOnLoginButton();



    }


}
