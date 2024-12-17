package pages.TestautWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class LandingPage_PF {

//    https://testautomationpractice.blogspot.com/

    WebDriver driver;


    @FindBy(xpath = "//a[text()='Hidden Elements & AJAX']")
    WebElement hiddenElements;

    @FindBy(xpath = "//a[text()='Download Files']")
    WebElement downloadFiles;



    public LandingPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    public void clickOnhiddenElemenst(){
        hiddenElements.click();
    }

    public void clickOnDownloadFiles(){
        downloadFiles.click();
    }








}
