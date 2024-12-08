package Befror_After_Methods.Before_After_Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ac1 {


    @BeforeMethod
    public void login() {
        System.out.println("login");
    }

    @AfterMethod
    public void logOut() {
        System.out.println("logOut");
    }

    @Test(priority = 1)
    public void search() {
        System.out.println("search");
    }

    @Test(priority = 2)
    public void advanceSearch() {
        System.out.println("advance Search");
    }


}
