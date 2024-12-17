package ParalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class test1 {

   public WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String br){

        switch (br) {
            case "CHROME":
                driver=new ChromeDriver();
                break;
            case "EDGE":
                driver=new EdgeDriver();
                break;
            default:
                System.out.println("invalid");
                return;
        }

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }


    @Test(priority = 1)
    public void testLogo(){

       boolean logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img")).isDisplayed();
        Assert.assertTrue(logo,"true");
//        if(logo==true){
//            System.out.println("logo is presented");
//        }else System.out.println("logo is not presented");
    }


    @Test(priority = 2)
    public void testTitle(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

    }

    @Test(priority = 3)
    public void testUrl(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


//    @AfterClass
//    public void teardown(){
//        driver.close();
//        driver.quit();
//    }



}
