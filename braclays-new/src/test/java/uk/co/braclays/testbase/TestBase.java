package uk.co.braclays.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.braclays.basepage.BasePage;
import uk.co.braclays.browserSelector.BrowserSelector;
import uk.co.braclays.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;


    public class TestBase extends BasePage {

        //object created for browser selector
        BrowserSelector browserSelector = new BrowserSelector();

        LoadProperty loadProperty = new LoadProperty();

        String baseUrl = loadProperty.getProperty("baseUrl");
        String browser = loadProperty.getProperty("browser");



        //before method comes from TestNG to do action before method
        @BeforeMethod
        //below code to open chrome browser//
        public void openBrowser() {
            browserSelector.selectBrowser(browser);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseUrl);

        }

        //after class comes from TestNG to do action after class
        @AfterMethod
        //below code closed browsers
        public void tearDown() {
            driver.quit();
        }
    }

