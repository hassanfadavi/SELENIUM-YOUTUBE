package pages.practice_BDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceLoginPage {


    WebDriver driver;

    public WebElement email;
    public WebElement pass;
    public WebElement loginButton;


    public practiceLoginPage(WebDriver driver){
        this.driver=driver;
        email=driver.findElement(By.xpath("//input[@name='username']"));
        pass=driver.findElement(By.xpath("//input[@id='password']"));
        loginButton=driver.findElement(By.xpath("//input[@name='login']"));
    }


    public void enterEmail(String emailInput){
        email.sendKeys(emailInput);
    }


    public void enterpass(String passInput){
        pass.sendKeys(passInput);
    }

    public void clickOnLoginButton(){
        loginButton.click();

    }






}
