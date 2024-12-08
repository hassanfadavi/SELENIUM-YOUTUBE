package Befror_After_Methods.Before_After_Class;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ac1 {



    @BeforeClass
    public  void login(){
        System.out.println("login");
    }

    @Test(priority = 1)
    public void search() {
        System.out.println("search");
    }

    @Test(priority = 2)
    public void advanceSearch() {
        System.out.println("advance Search");
    }


    @AfterClass
    public void logOut(){
        System.out.println("logOut");
    }

}
