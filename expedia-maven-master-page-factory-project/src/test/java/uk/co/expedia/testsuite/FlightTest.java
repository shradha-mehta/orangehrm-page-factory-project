package uk.co.expedia.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.testbase.TestBase;


public class FlightTest extends TestBase {
    HomePage homePage;
    FlightsPage flightsPage;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUp() {
        homePage = new HomePage();
        flightsPage = new FlightsPage();
    }


    @Test(groups = {"sanity","regression"},priority = 1)
    public void verifyUserShouldFindDestinationAccordingToUserRequirement(){
        homePage.clickOnAcceptButton();
        homePage.clickOnFlightButton();
        flightsPage.enterFlyingFrom("London (LHR-Heathrow)");
        flightsPage.enterGoingTo("Ahmedabad (AMD-Sardar Vallabhbhai Patel Intl.)");
        flightsPage.enterDepartingDate("20/12/2020");
        flightsPage.enterReturningDate("21/01/2021");
        flightsPage.clickOnTravellers();
        flightsPage.clickOnAdults();
        flightsPage.clickOnClose();
        flightsPage.clickOnSearchButton();
        String expectedResult = "Select your departure to Ahmedabad";
        String actualResult = flightsPage.getDestinationText();
        Assert.assertEquals(expectedResult, actualResult);







    }
}
