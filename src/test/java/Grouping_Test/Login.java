package Grouping_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {



    @BeforeClass(groups = {"logIn","logOut"} )
    public  void login(){
        System.out.println("login");
    }


    @AfterClass(groups = {"logIn","logOut"} )
    public void logOut(){
        System.out.println("logOut");
    }



    @Test(groups ={"logIn"} )
    public void logInGoogle(){
        System.out.println("logIn google");
    }

    @Test(groups ={"logIn"} )
    public void  logInfacebook(){
        System.out.println("logIn facebook");
    }
}


