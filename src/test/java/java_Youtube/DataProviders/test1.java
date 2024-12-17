package java_Youtube.DataProviders;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import utils.WaitUtils;

import java.time.Duration;

public class test1 {


    ChromeDriver driver=new ChromeDriver();

   @DataProvider(name="dp" )
    public Object[][] loginData(){

        Object data[][]={    {"john@gmail.com","123"  },
                             {"john@gmail.com","john"  },
                             {"jamshid@gmail.com","BatA@E2zpkXYtg"  }
                                                         };
        return data;

   }

   @Test(dataProvider ="dp" )
    public void login(String email,String pass){

      driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
       WaitUtils.applyGlobalWait();
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
       WaitUtils.applyGlobalWait();
       driver.findElement(By.xpath("//button[@type='submit']//span")).click();


   }




}
