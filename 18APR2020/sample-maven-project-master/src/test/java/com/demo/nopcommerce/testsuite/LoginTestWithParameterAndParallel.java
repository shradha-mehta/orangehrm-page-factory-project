package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class LoginTestWithParameterAndParallel extends BasePage {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser){
        browserSelector.selectBrowser(browser);
        driver.get(new LoadProperty().getProperty("baseUrl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();;
    }



}
