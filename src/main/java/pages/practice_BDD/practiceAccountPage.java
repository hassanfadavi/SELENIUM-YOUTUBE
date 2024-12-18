package pages.practice_BDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceAccountPage {

    WebDriver driver;

    public WebElement validateMyAccount;


    public practiceAccountPage(WebDriver driver){
        this.driver=driver;
        validateMyAccount=driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']//strong"));
    }







}
