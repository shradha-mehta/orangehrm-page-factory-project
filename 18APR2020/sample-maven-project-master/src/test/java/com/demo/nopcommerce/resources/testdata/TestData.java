package com.demo.nopcommerce.resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        return new Object[][]{
                {"test1@gmail.com", "test123"},
                {"test2@gmail.com", "test234"},
                {"test3@gmail.com", "test456"}
         };
    }

}
