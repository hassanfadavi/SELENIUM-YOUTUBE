package pages.TestautWebsite_PF_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HiddenElementPage_PF {


     WebDriver driver;

    @FindBy(xpath = "//div[@id='container']//input[@type='text' and @id='input1']")
    WebElement box1;


    public HiddenElementPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void inputBox1(String text1){
        box1.sendKeys(text1);
    }







}
