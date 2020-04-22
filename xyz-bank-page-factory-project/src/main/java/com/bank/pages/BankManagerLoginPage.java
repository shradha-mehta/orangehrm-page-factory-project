package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());


    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addCustomerLink;
    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement _clickOnCustomerFeature;
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchCustomer;
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _enterCustomer;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement _deleteCustomer;

    public void clickOnAddCustomerFeature() {
        Reporter.log("Clicking to add customer " + _addCustomerLink.toString() + "<br>");
        clickOnElement(_addCustomerLink);
        log.info("Clicking to add customer " + _addCustomerLink.toString());
    }

    public void clickOnCustomerButton() {
        Reporter.log("Clicking on customer button " + _clickOnCustomerFeature.toString() + "<br>");
        clickOnElement(_clickOnCustomerFeature);
        log.info("Clicking on customer button " + _clickOnCustomerFeature.toString());
    }

    public void clickOnSearchCustomer() {
        Reporter.log("Clicking button to search customer " + _searchCustomer.toString() + "<br>");
        clickOnElement(_searchCustomer);
        log.info("Clicking button to search customer " + _searchCustomer.toString());
    }

    public void enterCustomerName(String customerName) {
        Reporter.log("Entering customer name " +customerName+ "Customer name field"+ _enterCustomer.toString() + "<br>");
        sendTextToElement(_enterCustomer, customerName);
        log.info("Entering customer name " +customerName+ "Customer name field" + _enterCustomer.toString());
    }

    public void clickToDeleteCustomer() {
        Reporter.log("Clicking to delete customer " + _deleteCustomer.toString() + "<br>");
        clickOnElement(_deleteCustomer);
        log.info("Clicking to delete customer " + _deleteCustomer.toString());
    }


}
