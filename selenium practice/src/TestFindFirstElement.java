import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFindFirstElement {
    public static void main(String[] args) throws InterruptedException {


            String baseUrl = "https://demo.nopcommerce.com/";
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
            WebElement loginglink = driver.findElement(By.linkText("Log in"));
            loginglink.click();
            Thread.sleep(2000);

            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("shradhajiya@gmail.com");
        WebElement passwordField = driver.findElement(By.name("Password"));
            passwordField.sendKeys("Jiya0804");
            WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
            login.click();
            WebElement errorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        System.out.println(errorMsg.getText());
        WebElement printMsg = driver.findElement(By.xpath("//div[@class='text']"));
        System.out.println(printMsg.getText());





    }
}