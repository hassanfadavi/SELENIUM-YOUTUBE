package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Array;

public class Ac1 {



    //hard assertions
    @Test
    public void testTitle( ){
        System.out.println("a");
        Assert.assertEquals( "hii","hi");
        System.out.println("b");
    }


//    soft assertions
    @Test
    public void testTitle2( ){
        System.out.println("c");
      SoftAssert  as=new SoftAssert();
        as.assertEquals( "hii","hi");
        System.out.println("f");
        as.assertAll();
    }

}
