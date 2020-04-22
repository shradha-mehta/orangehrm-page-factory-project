package com.learn.letskodeit.pages;

import com.learn.letskodeit.utilty.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

//home page class extends utility class to use properties of utility class
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //locators for each elements on home page

    //By practiceLink = By.partialLinkText("Practi");

    // By loginLink = By.partialLinkText("Login");

    //By signUpLink = By.id("header-sign-up-btn");

    @FindBy(partialLinkText = "Practi")
    WebElement _practiceLink;

    @FindBy(partialLinkText = "Login")
    WebElement _loginLink;

    @FindBy(id = "header-sign-up-btn")
    WebElement _signUpLink;


    //below all methods for each elements and doing actions on that each elements
    public void clickOnLogin() {
       // Reporter.log("Clicking On Login Link" + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking On Login Link" + _loginLink.toString());
    }

    public void clickOnPracticeLink() {
        Reporter.log("Clicking On Login Link" + _practiceLink.toString() + "<br>");
        clickOnElement(_practiceLink);
        log.info("Clicking On Login Link" + _practiceLink.toString());
    }

    public void clickOnSignUpLink() {
        Reporter.log("Clicking On Login id" +_signUpLink.toString() + "<br>");

        clickOnElement(_signUpLink);
        log.info("Clicking On Login Link" + _signUpLink.toString());
    }
}


