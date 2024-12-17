package PageObjectClasses.WithOutPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTest {

    WebDriver driver;


    @BeforeClass
     public void setUp( ){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }


    @Test
    public void login() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.inputUserName("hasssan");
        Thread.sleep(1000);
        loginPage.inputPass("hassan");
        Thread.sleep(1000);
        loginPage.clickOnLogin();
        Thread.sleep(1000);

    }

//
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }




}
