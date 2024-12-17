package tests.TestautSite;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestautWebsite.DownloadFilePage_PF;
import pages.TestautWebsite.HiddenElementPage_PF;
import pages.TestautWebsite.LandingPage_PF;
import utils.WaitUtils;

public class TestautMain extends BaseTest {


    @Test(priority = 1)
    public void hiddenElemnet(){

        LandingPage_PF landingPage_PF =new LandingPage_PF(driver);
        HiddenElementPage_PF hiddenElementPage_PF=new HiddenElementPage_PF(driver);
        landingPage_PF.clickOnhiddenElemenst();
        logger.info("clicked on hidden Element");
        WaitUtils.applyGlobalWait();
        hiddenElementPage_PF.inputBox1(randomNumber()+"hassan");
        WaitUtils.applyGlobalWait();
    }

    @Test(priority = 2)
    public void download() {

        try {

            LandingPage_PF landingPage_PF = new LandingPage_PF(driver);
            DownloadFilePage_PF downloadFilePage_PF = new DownloadFilePage_PF(driver);

            landingPage_PF.clickOnDownloadFiles();
            String actualText = downloadFilePage_PF.getText2();
            String expectedText = "Download Files";

            Assert.assertEquals(actualText, expectedText, "dont matches");
        } catch (Exception e)
        {
            logger.error("test failed");
            Assert.fail();
        }

    }


    public String randomString(){
       String generateString=RandomStringUtils.randomAlphabetic(5);
        return generateString;
    }

    public String randomNumber(){
        String generateNumber =RandomStringUtils.randomNumeric(10);
        return generateNumber;
    }






}
