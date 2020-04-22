package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;


public class FlightsPage extends Utility {
    By flyingFrom = By.xpath("//input[@id='flight-origin-hp-flight']");
    By goingTo = By.xpath("//input[@id='flight-destination-hp-flight']");
    By departing = By.xpath("//input[@id='flight-departing-hp-flight']");
    By returning = By.xpath("//input[@id='flight-returning-hp-flight']");
    By travellers = By.xpath("//div[@class='menu-bar gcw-travel-selector-wrapper']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']");
    By adultsTwo = By.xpath("//body[contains(@class,'')]/meso-native-marquee/section[@id='WizardHero']/div[@id='hero-banner']/div[contains(@class,'hero-banner-gradient native-marquee')]/div[contains(@class,'cols-row hero-banner-inner')]/section[@id='wizardSection']/div[contains(@class,'hero-banner-box siteId-3 cf hideClassicDcol')]/div[@id='wizard-tabs']/div[contains(@class,'tabs-container col')]/section[@id='section-flight-tab-hp']/form[@id='gcw-flights-form-hp-flight']/fieldset[contains(@class,'room-data')]/div[contains(@class,'cols-nested')]/div[contains(@class,'ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both')]/div[@id='traveler-selector-hp-flight']/div[contains(@class,'menu-bar gcw-travel-selector-wrapper')]/ul[contains(@class,'menu-bar-inner')]/li[contains(@class,'open')]/div[contains(@class,'menu sticky gcw-menu')]/div[contains(@class,'menu-main')]/div[contains(@class,'traveler-selector-sinlge-room-data traveler-selector-room-data')]/div[contains(@class,'uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized')]/div[contains(@class,'uitk-col all-col-shrink')]/button[contains(@class,'uitk-step-input-button uitk-step-input-plus')]/span[1]//*[local-name()='svg']");
    By close = By.xpath("//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]");
    By searchButton = By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]");
    By getSameDestinationText = By.xpath("//span[@class='title-city-text']");


    public void enterFlyingFrom(String flyingLocation) {
        sendTextToElement(flyingFrom, flyingLocation);
    }

    public void enterGoingTo(String goingLocation) {
        sendTextToElement(goingTo, goingLocation);
    }

    public void enterDepartingDate(String date) {
        sendTextToElement(departing, date);
    }

    public void enterReturningDate(String returnDate) {
        clearTextFromField(returning);
        sendTextToElement(returning, returnDate);
    }

    public void clickOnTravellers() {
        clickOnElement(travellers);
    }

    public void clickOnAdults() {
        clickOnElement(adultsTwo);
    }

    public void clickOnClose() {
        clickOnElement(close);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public String getDestinationText() {
        return getTextFromElement(getSameDestinationText);
    }
}
