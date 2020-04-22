package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestWithParameterAndParallel extends BasePage {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    BrowserSelector browserSelector =new BrowserSelector()
    @BeforeMethod
    Public void setUp(){
        browserSelector.selectorBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseUrl;
        driver.get(baseUrl);

    }
}

    @Test
    public void verifyUserShouldNavigateToLoginPage1() {
        homePage.clickOnLoginLink();

        String expectedText = "Welcome, Pleasee Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);

}
