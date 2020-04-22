package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class LoginTestWithDataProvider extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username, password);
    }

}
