package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.pages.PracticePage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//practice test extends with test base class
    public class PracticeTest extends TestBase {
        //object created
        HomePage homePage;
        LoginPage loginPage;
        PracticePage practicePage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        practicePage = new PracticePage();
    }

    @Test(groups = {"sanity","regression"})
        public void verifyUserCanNavigateToPracticePage(){
            //below methods calling from pages package
            homePage.clickOnPracticeLink();
            //compare expected with actual result
            String expectedResult = "Practice Page";
            String actualResult = practicePage.getPracticePageMessage();
            Assert.assertEquals(expectedResult,actualResult);

        }
    }

