package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.excelutility.ExcelUtility;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class LoginTestWithExcel extends TestBase {

    public static final String File_Path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\demo\\nopcommerce\\resources\\testdata\\ExcelData.xlsx";

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void setExcel(){
        // Tell the code about the location of Excel file
        try {
            ExcelUtility.setExcelFile(File_Path, "LoginTests");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "loginData")
    public Object[][] getData(){
        Object[][] data = ExcelUtility.getTestData("Invalid_Login");
        return data;
    }


    @Test(dataProvider = "loginData")
    public void doLogin(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username, password);
    }

}
