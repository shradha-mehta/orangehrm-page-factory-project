package checkBoxAndRedioButton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCheckBoxies {
    WebDriver driver;

    @Before
    public void openBrowser(){
        String baseUrl = "http://";
    }
    @Test
    public void checkBoxesExample(){
        driver.findElement(By.xpath("//div[4]/input[1]")).click();
        driver.findElement(By.xpath("//div[4]/input[2]")).click();
        driver.findElement(By.xpath("//div[4]/input[3]")).click();
        driver.findElement(By.xpath("//div[4]/input[4]")).click();
        for (int i = 1; i <=4; i++){
            driver.findElement(By.xpath("//div[4]/input["+ i +"]")).click();

            @After
            public void closingBrowser(){
                driver.close();
            }
        }


    }
}
