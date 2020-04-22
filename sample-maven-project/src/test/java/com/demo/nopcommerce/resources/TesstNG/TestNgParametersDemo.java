package com.demo.nopcommerce.resources.TesstNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParametersDemo {
    @Test
    @Parameters("MyName")
 public void test (String name){
     System.out.println("My name"+ name);
 }
}
