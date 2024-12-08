package Befror_After_Methods.Before_After_Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {


    @Test
    public void abc(){
        System.out.println("abc");
    }

    @BeforeTest
    public void bt(){
        System.out.println("before test");
    }

    @AfterTest
    public void at(){
        System.out.println("after test");
    }


}
