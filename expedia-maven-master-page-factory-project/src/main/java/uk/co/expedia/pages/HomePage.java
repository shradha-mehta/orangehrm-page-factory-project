package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    //By accept = By.xpath("//span[@class='button-text']");
    //By signInLink = By.xpath("//button[@id='header-account-signin-button']");
    //By flightLink = By.xpath("//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']");

    @FindBy(xpath = "//span[@class='button-text']")
    WebElement _accept;

    @FindBy(xpath = "//button[@id='header-account-signin-button']")
    WebElement _signInLink;

    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']")
    WebElement _flightLink;

    public void clickOnAcceptButton() {
        Reporter.log("Clicking on login link : " + _accept.toString() + "<br>");
        clickOnElement(_accept);
        log.info("Clicking on login link : " + _accept.toString());

    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking on login link : " + _signInLink.toString() + "<br>");
        clickOnElement(_signInLink);
        log.info("Clicking on login link : " + _signInLink.toString());
    }

    public void clickOnFlightButton() {
        Reporter.log("Clicking on login link : " + _flightLink.toString() + "<br>");
        clickOnElement(_flightLink);
        log.info("Clicking on login link : " + _flightLink.toString());
    }
}
