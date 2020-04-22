package uk.co.braclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.braclays.pages.HomePage;
import uk.co.braclays.pages.LoginPage;
import uk.co.braclays.testbase.TestBase;


    //login test class extends with test base class
      public class LoginTest extends TestBase {
        //object created
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();


        @Test
        public void verifyUserShouldNavigateToLoginFeature() {
            //below methods calling from pages package
            homePage.clickOnLoginButton();

            //compare expected with actual result
            String expectedResult = "How would you like to log in?";
            String actualResult = loginPage.getLoginText();
            Assert.assertEquals(expectedResult, actualResult);
        }
    }


