package com.demo.nopcommerce.TesstNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNGParametersDemo {


    @Test
    @Parameters("MyName")
    public void test(String name){
        System.out.println("My name "+ name);
    }

}
