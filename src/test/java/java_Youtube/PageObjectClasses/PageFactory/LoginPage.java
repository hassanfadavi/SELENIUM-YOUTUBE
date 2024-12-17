package PageObjectClasses.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;


    //locator
//   WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));

            @FindBy(xpath ="//input[@name='username']" )
           WebElement  userNameLocator;
            @FindBy(xpath ="//input[@name='password']" )
             WebElement   passLocator;
            @FindBy(xpath = "//button[@type='submit']")
            WebElement loginBtnLocator;



    //constructor
    public LoginPage( WebDriver driver){
         this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    //Action Method
    public void inputUserName(String userName){
       userNameLocator.sendKeys(userName);
    }

    public void inputPass(String pass){
        passLocator.sendKeys(pass);
    }

    public void clickOnLogin(){
        loginBtnLocator.click();
    }






}
