package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BankTest extends TestBase {
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    CustomerPage customerPage;
    AccountPage accountPage;


    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUp() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customerPage = new CustomerPage();
        accountPage = new AccountPage();

    }
     /*
    1.bankManagerShouldAddCustomerSuccessfully.
        click On "Bank Manager Login" Tab
	click On "Add Customer" Tab
	enter FirstName
	enter LastName
	enter PostCode
	click On "Add Customer" Button
	popup display
	verify message "Customer added successfully"
	click on "ok" button on popup.
     */

    @Test(groups = {"sanity", "smoke"}, priority = 0)
    public void verifyBankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerFeature();
        addCustomerPage.enterFirstName("Hermoine");
        addCustomerPage.enterLastName("Granger");
        addCustomerPage.enterPostCode("E859AC");
        addCustomerPage.clickOnAddCustomerButton();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully"));
        alert.accept();

    }/*
    2. bankManagerShouldOpenAccountSuccessfully.
	click On "Bank Manager Login" Tab
	click On "Open Account" Tab
	Search customer that created in first test
	Select currency "Pound"
	click on "process" button
	popup displayed
	verify message "Account created successfully"
	click on "ok" button on popup.
    */

    @Test(groups = {"regression"}, priority = 1)
    public void verifyBankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        openAccountPage.clickOnOpenAccountButton();
        openAccountPage.clickOnCustomerName();
        openAccountPage.selectCustomerFirstName();
        openAccountPage.clickOnCurrencyButton();
        openAccountPage.selectCurrencyPound();
        openAccountPage.clickOnProcessButton();
        Alert alert = driver.switchTo().alert();
        String expectedResult = "Account created successfully";
        String actualResult = alert.getText();
        Assert.assertTrue(actualResult.contains("Account created successfully"), expectedResult);
        alert.accept();


    } /*
    3. customerShouldLoginAndLogoutSuceessfully.
        click on "Customer Login" Tab
          search customer that you created.
        click on "Login" Button
        verify "Logout" Tab displayed.
        click on "Logout"
        verify "Your Name" text displayed.
     */

    @Test(groups = {"sanity", "smoke", "regression"}, priority = 2)
    public void verifyCustomerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnCustomerLoginButton();
        customerPage.clickOnYourName();
        customerPage.clickOnSelectName();
        customerPage.clickOnLoginButton();
        String expectedResult = "Logout";
        String actualResult = customerLoginPage.getLogoutFeature();
        Assert.assertEquals(expectedResult, actualResult);
        customerLoginPage.clickLogoutFeature();
        String expectedResult1 = "Your Name";
        String actualResult1 = customerPage.getYourNameMessage();
        Assert.assertTrue(actualResult1.contains("Your Name"), expectedResult1);


    } /*
    4. customerShouldDepositMoneySuccessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Deposit" Tab
	Enter amount 100
	click on "Deposit" Button
	verify message "Deposit Successful"
     */

    @Test(groups = {"sanity", "smoke"}, priority = 3)
    public void verifyCustomerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginButton();
        customerPage.clickOnYourName();
        customerPage.clickOnSelectName();
        customerPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmountToDeposit("100");
        accountPage.clickDepositFeature();
        String expectedResult = "Deposit Successful";
        String actualResult = accountPage.getTextDepositSuccessfulMessage();
        Assert.assertTrue(actualResult.contains("Deposit Successful"), expectedResult);

    }/*
5. customerShouldWithdrawMoneySuccessfully
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Withdrawl" Tab
	Enter amount 50
	click on "Deposit" Button
	verify message "Transaction Successful"

 */

    @Test(groups = {"regression"}, priority = 4)
    public void verifyCustomerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLoginButton();
        customerPage.clickOnYourName();
        customerPage.clickOnSelectName();
        customerPage.clickOnLoginButton();
        accountPage.clickOnWithdrawal();
        accountPage.clickOnAmountWithdrawalButton("50");
        accountPage.clickOnWithdrawFeature();
    }

    @Test(groups = {"regression"}, priority = 5)
    public void verifyBankManagerShouldDeleteCustomerAccountSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnCustomerButton();
        bankManagerLoginPage.clickOnSearchCustomer();
        bankManagerLoginPage.enterCustomerName("Hermoine");
        bankManagerLoginPage.clickToDeleteCustomer();
    }


}
