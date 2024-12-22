package java_Youtube.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Ac1 {

    WebDriver driver;

    @Test(priority = 1)
    public void openApp(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

   @Test(priority = 2)
    public void logo() throws InterruptedException {
        Thread.sleep(1000);
  boolean logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img[@alt='company-branding']")).isDisplayed();
       System.out.println(logo);
    }

    @Test(priority = 3)
    public void logIn() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(" admin123");
        Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 4)
    public void logOut(){
  driver.quit();
    }


    }



