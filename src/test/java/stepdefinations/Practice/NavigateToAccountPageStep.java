package stepdefinations.Practice;

import base.BaseTest;
import config.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.practice_BDD.practiceAccountPage;
import pages.practice_BDD.practiceLandingPage;
import pages.practice_BDD.practiceLoginPage;
import utils.WaitUtils;

public class NavigateToAccountPageStep extends BaseTest {

    practiceLandingPage practiceLandingPage;
    practiceLoginPage PracticeLoginPage; ;
    practiceAccountPage practiceAccountPage;

   @Before
   public void Setup(){
       setup();
       this.practiceLandingPage=new practiceLandingPage(DriverFactory.getDriver());
   }

    @Given ("The user is on homePage")
    public void The_user_is_on_homePage(){


    }

    @And("I click on log in")
    public void i_click_on_log_in() {

        practiceLandingPage.clickOnLogin();
        WaitUtils.applyGlobalWait();

    }
//
    @And("I enter email")
    public void I_enter_emai() {
        this.PracticeLoginPage=new practiceLoginPage(DriverFactory.getDriver()) ;
        PracticeLoginPage.enterEmail("hassan@gmail.com");
        WaitUtils.applyGlobalWait();


    }

    @And ("I enter password")
    public void I_enter_password() {
        PracticeLoginPage.enterpass("Test@selenium");
        WaitUtils.applyGlobalWait();
    }


//
    @And("I click on login button")
    public void i_click_on_login_button() {

       PracticeLoginPage.clickOnLoginButton();
       WaitUtils.applyGlobalWait();

    }
//
    @Then("user must successfully login to the webPage")
    public void user_must_successfully_login_to_the_web_page() {
     this.practiceAccountPage =new practiceAccountPage(DriverFactory.getDriver());
        String actualText= practiceAccountPage.validateMyAccount.getText();
        String expectedText="hassan1";
        try {
            Assert.assertEquals(actualText,expectedText,"not  match");
        }catch (Exception e) {
            logger.info("check verification");
        }

    }

    @After
    public void tear(){
       tearDown();
    }


}
