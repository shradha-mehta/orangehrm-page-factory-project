package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");


    public void clickOnLoginLink(){
        Reporter.log("Clicking on login link " +loginLink.toString()+ "<br>");
        clickOnElement(loginLink);
        log.info("Clicking on login link " +loginLink.toString());
    }

    public void clickOnRegisterLink(){
        Reporter.log("Clicking on Registration link " +registerLink.toString()+ "<br>");
        clickOnElement(registerLink);
        log.info("Clicking on Registration link " +registerLink.toString());
    }


}
