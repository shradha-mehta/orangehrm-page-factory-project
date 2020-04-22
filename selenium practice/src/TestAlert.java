import org.junit.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestAlert {
    WebDriver driver;
    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver=new ChromeDriver(options);
        driver.manage().window();

    }
}
