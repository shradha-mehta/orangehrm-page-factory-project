package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import sun.security.x509.X400Address;


public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement _openAccountLink;
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _customerLink;
    @FindBy(xpath = "//option[contains(text(),'Hermoine Granger')]")
    WebElement _selectCustomerName;
    @FindBy(id = "currency")
    WebElement _currencyLink;
    @FindBy(xpath = "//option[contains(text(),'Pound')]")
    WebElement _currencyPound;
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _clickOnProcess;

    public void clickOnOpenAccountButton() {
        Reporter.log("Clicking on open account button " + _openAccountLink.toString() + "<br>");
        clickOnElement(_openAccountLink);
        log.info("Clicking on open account button " + _openAccountLink.toString());
    }

    public void clickOnCustomerName() {
        Reporter.log("Clicking on customer name " + _customerLink.toString() + "<br>");
        clickOnElement(_customerLink);
        log.info("Clicking on customer name " + _customerLink.toString());
    }

    public void selectCustomerFirstName() {
        Reporter.log("Selecting customer name " + _selectCustomerName.toString() + "<br>");
        clickOnElement(_selectCustomerName);
        log.info("Selecting customer name " + _selectCustomerName.toString());
    }

    public void clickOnCurrencyButton() {
        Reporter.log("Clicking on currency button " + _customerLink.toString() + "<br>");
        clickOnElement(_currencyLink);
        log.info("Clicking on currency button " + _customerLink.toString());
    }

    public void selectCurrencyPound() {
        Reporter.log("Selecting currency as pound " + _currencyPound.toString() + "<br>");
        clickOnElement(_currencyPound);
        log.info("Selecting currency as pound " + _currencyPound.toString());
    }

    public void clickOnProcessButton() {
        Reporter.log("Clicking on process button " + _clickOnProcess.toString() + "<br>");
        log.info("Clicking on process button " + _clickOnProcess.toString());
        clickOnElement(_clickOnProcess);

    }


}
