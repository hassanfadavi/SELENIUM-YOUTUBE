package pages.TestautWebsite_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadFilePage_PF {

    WebDriver driver;

    @FindBy(xpath = "//div[@itemprop='blogPost']//h3")
    WebElement getDownloadText;


    public DownloadFilePage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public String getText2(){
        try {
           return (getDownloadText.getText());
        }catch (Exception e) {
            return (e.getMessage());
        }

    }


}
