package Befror_After_Methods.Before_After_Suit;

import org.testng.annotations.*;

public class test1 {


    @Test
    public void abc(){
        System.out.println("test1");
    }

    @BeforeTest
    public void bt(){
        System.out.println("before test");
    }

    @AfterTest
    public void at(){
        System.out.println("after test");
    }

    @BeforeSuite
    public void bs(){
        System.out.println("before suit");
    }

    @AfterSuite
    public void as(){
        System.out.println("after suit");
    }



}
