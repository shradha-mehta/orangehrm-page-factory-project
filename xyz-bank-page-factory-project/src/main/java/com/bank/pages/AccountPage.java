package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement _depositLink;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _AmountToBeDepositedLink;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositButton;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _getTextDepositSuccessful;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountToBeWithdrawn;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _withdraw;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _getTransactionText;
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement _withdrawalLink;

    public void clickOnDepositButton() {
        Reporter.log("Clicking on deposit button " + _depositLink.toString() + "<br>");
        clickOnElement(_depositLink);
        log.info("Clicking on deposit button " + _depositLink.toString());
    }

    public void enterAmountToDeposit(String amount) {
        Reporter.log("Enter amount to deposit " + amount+ "Enter amount "+ _AmountToBeDepositedLink.toString() + "<br>");
        sendTextToElement(_AmountToBeDepositedLink, amount);
        log.info("Enter amount to deposit " +amount+ "Enter amount "+ _AmountToBeDepositedLink.toString());
    }

    public void clickDepositFeature() {
        Reporter.log("Clicking on deposit feature " + _depositButton.toString() + "<br>");
        clickOnElement(_depositButton);
        log.info("clicking on deposit feature " + _depositButton.toString());
    }

    public String getTextDepositSuccessfulMessage() {
        Reporter.log("Getting text deposit successful message " + _getTextDepositSuccessful.toString());
        log.info("Getting text deposit successful message " + _getTextDepositSuccessful.toString());
        return getTextFromElement(_getTextDepositSuccessful);
    }

    public void clickOnWithdrawal() {
        Reporter.log("Clicking on withdrawal button " + _withdrawalLink.toString() + "<br>");
        clickOnElement(_withdrawalLink);
        log.info("Clicking on withdrawal button " + _withdrawalLink.toString());
    }

    public void clickOnAmountWithdrawalButton(String withAmount) {
        Reporter.log("Clicking on withdrawal button " + withAmount+" withdrawal amount "+ _amountToBeWithdrawn.toString() + "<br>");
        sendTextToElement(_amountToBeWithdrawn, withAmount);
        log.info("Clicking on withdrawal button " + withAmount+ "withdrawal amount "+_amountToBeWithdrawn.toString());
    }

    public void clickOnWithdrawFeature() {
        Reporter.log("Clicking on withdrawal feature " + _withdraw.toString() + "<br>");
        clickOnElement(_withdraw);
        log.info("Clicking on withdrawal feature " + _withdraw.toString());
    }

    public String getTextTransaction() {
        Reporter.log("Getting text transaction message " + _getTransactionText.toString() + "<br>");
        log.info("Getting text transaction message " + _getTransactionText);
        return getTextFromElement(_getTransactionText);
    }


}
