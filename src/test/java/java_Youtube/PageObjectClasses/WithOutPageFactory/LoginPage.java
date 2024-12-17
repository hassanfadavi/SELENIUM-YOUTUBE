package PageObjectClasses.WithOutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;


    //locator
//   WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
           By userNameLocator=By.xpath("//input[@name='username']");
           By passNameLocator=By.xpath("//input[@name='password']");
           By loginBtnLocator=By.xpath("//button[@type='submit']");


    //constructor
    public LoginPage( WebDriver driver){
         this.driver=driver;
    }


    //Action Method
    public void inputUserName(String userName){
        driver.findElement(userNameLocator).sendKeys(userName);
    }

    public void inputPass(String pass){
        driver.findElement(passNameLocator).sendKeys(pass);
    }

    public void clickOnLogin(){
        driver.findElement(loginBtnLocator).click();
    }






}
