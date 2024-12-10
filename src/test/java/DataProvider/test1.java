package DataProvider;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class test1 {


    public WebDriver driver;

    @BeforeClass
   public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
   }


   @Test(dataProvider = "dp")
   public void testLogin(String email,String pass) throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

        driver.findElement(By.xpath("//input[@name='password']")). sendKeys(pass);

       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       Thread.sleep(1000);

       driver.findElement(By.xpath("//input[@name='email']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).clear();
//       emailElement.clear();
//       passElement.clear();
   }


   @AfterClass
    public void teardown(){
       driver.close();
        driver.quit();
   }



   @DataProvider(name="dp",indices = {0,2})
    public Object[][] loginData(){

        Object data[][]={    {"john@gmail.com","123"  },
                             {"john@gmail.com","john"  },
                             {"jamshid@gmail.com","BatA@E2zpkXYtg"  }
                                                         };
        return data;

   }




}
