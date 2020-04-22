package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Jay
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");

    public void enterEmailId(String email){
        Reporter.log("Enter email "+email+ "to email field " +emailField.toString()+ "<br>");
        sendTextToElement(emailField, email);
        log.info("Enter email "+email+ "to email field " +emailField.toString());
    }

    public void enterPassword(String password){
        Reporter.log("Enter password "+password+ "to password field " +passwordField.toString()+ "<br>");
        sendTextToElement(passwordField, password);
        log.info("Enter password "+password+ "to password field " +passwordField.toString());
    }

    public void clickOnLoginButton(){
        Reporter.log("Clicking on login button " +loginBtn.toString()+ "<br>");
        clickOnElement(loginBtn);
        log.info("Clicking on login button " +loginBtn.toString());
    }

    public String getWelcomeText(){
        Reporter.log("Getting text from " +welcomeText.toString()+ "<br>");
        log.info("Getting text from " +welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void loginToApplication(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}
