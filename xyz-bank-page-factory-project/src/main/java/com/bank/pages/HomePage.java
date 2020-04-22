package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginLink;
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLogin;

    public void clickOnBankManagerLoginButton() {
        Reporter.log("Clicking on bank manager login button " + _bankManagerLoginLink.toString() + "<br>");
        clickOnElement(_bankManagerLoginLink);
        log.info("Clicking on bank manager login button " + _bankManagerLoginLink.toString());
    }

    public void clickOnCustomerLoginButton() {
        Reporter.log("Clicking on customer login button " + _customerLogin.toString() + "<br>");
        clickOnElement(_customerLogin);
        log.info("Clicking on customer login button " + _customerLogin.toString());
    }


}
