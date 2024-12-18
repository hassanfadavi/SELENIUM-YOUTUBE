package pages.practice_BDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceLandingPage {



    WebDriver driver;

    public WebElement login;



    public practiceLandingPage(WebDriver driver){
        this.driver=driver;
        login=driver.findElement(By.xpath( "//a[text()='My Account']"));
    }


    public void clickOnLogin(){
        login.click();
    }


}
