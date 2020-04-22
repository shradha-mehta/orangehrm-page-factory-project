package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
   // Reporter.log(s "Clicking on loging link "+loginlink.toString());


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }
 //   Reporter.log (s"Clicking on Registration link "+ registerlink.toString()):
   //ClickOnElement(registerlink);
}
