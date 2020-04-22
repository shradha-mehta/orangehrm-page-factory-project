package uk.co.braclays.pages;

import org.openqa.selenium.By;
import uk.co.braclays.utility.Utility;

public class HomePage extends Utility {
    //below locators for elements on home page
    By loginLink = By.linkText("Log In");
    By registerLink = By.linkText("Register");
    By contactUsLink = By.xpath("//span[contains(text(),'Contact us')]");
    By findBranchLink = By.xpath("//span[contains(text(),'Find a branch')]");
    By searchLink = By.xpath("//li[@class='search']//span[contains(text(),'Search')]");

    //below methods creation for web elements and doing action on elements
    public void clickOnLoginButton() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerLink);
    }

    public void clickOnContactUsButton() {
        clickOnElement(contactUsLink);
    }

    public void clickOnFindBranchButton() {
        clickOnElement(findBranchLink);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchLink);
    }


}

