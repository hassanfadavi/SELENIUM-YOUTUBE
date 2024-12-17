package java_Youtube.Grouping_Test;

import org.testng.annotations.Test;

public class LogOut {




    @Test(groups ={"logOut"} )
    public void logoutGoogle(){
        System.out.println("logout google");
    }

    @Test(groups ={"logOut"} )
    public void  logOufacebook(){
        System.out.println("logout faceBook");
    }
}


