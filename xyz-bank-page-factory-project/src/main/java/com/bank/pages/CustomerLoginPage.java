package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _getLogoutButton;
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement _clickLogoutButton;


    public String getLogoutFeature() {
        Reporter.log("Getting logout text " + _getLogoutButton.toString() + "<br>");
        log.info("Getting logout text " + _getLogoutButton.toString());
        return getTextFromElement(_getLogoutButton);
    }

    public void clickLogoutFeature() {
        Reporter.log("Clicking on logout button " + _clickLogoutButton.toString() + "<br>");
        log.info("Clicking on logout button " + _clickLogoutButton.toString());
        clickOnElement(_clickLogoutButton);
    }


}
