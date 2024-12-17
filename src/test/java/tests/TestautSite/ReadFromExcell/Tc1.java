package tests.TestautSite.ReadFromExcell;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TestautWebsite.DownloadFilePage_PF;
import pages.TestautWebsite.HiddenElementPage_PF;
import pages.TestautWebsite.LandingPage_PF;
import utils.WaitUtils;

public class Tc1 extends BaseTest {




    @Test(dataProvider = "inputData", dataProviderClass = DataProviders.class)

    public void hiddenElemnet(String name){

        LandingPage_PF landingPage_PF =new LandingPage_PF(driver);
        HiddenElementPage_PF hiddenElementPage_PF=new HiddenElementPage_PF(driver);
        landingPage_PF.clickOnhiddenElemenst();
        logger.info("clicked on hidden Element");
        WaitUtils.applyGlobalWait();
        hiddenElementPage_PF.inputBox1(  name);
        WaitUtils.applyGlobalWait();
    }


}
