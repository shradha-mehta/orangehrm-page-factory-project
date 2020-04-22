package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;


public class SignInPage extends Utility {
    By emailAddress = By.xpath("//input[@id='gss-signin-email']");
    By passwordLink = By.xpath("//input[@id='gss-signin-password']");
    By signIn = By.xpath("//button[@id='gss-signin-submit']");
    By errorText = By.xpath("//div[@id='gss-signin-incorrect-email-or-password']");



    public void enterEmailAddress(String email){
        sendTextToElement(emailAddress, email);
    }public void enterPassword(String password){
        sendTextToElement(passwordLink, password);
    }public void clickOnSignInButton(){
        clickOnElement(signIn);
    }public String getErrorText(){
        return getTextFromElement(errorText);
    }

}
