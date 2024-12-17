package java_Youtube.DependsOnMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {


    @Test(priority = 1)
    public void openApp(){
        System.out.println("openApp");
        Assert.assertTrue(false);
    }


    @Test(priority = 2,dependsOnMethods = {"openApp"})
    public void login(){

        Assert.assertTrue(true);
        System.out.println("login");
    }

    @Test (priority = 3)
    public void logOut(){
        System.out.println("logOut");
        Assert.assertTrue(true);

    }




}
