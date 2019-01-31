package com.Odoo_Expenses.tests;

import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginTest extends TestBase {
    @Test
    public void logInTest(){

        extentLogger = report.createTest("Login Test.");
        extentLogger.info("Sign in");
        pages.login().signIn();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        extentLogger.info("Click on 'Expenses'. ");
        wait.until(ExpectedConditions.elementToBeClickable(pages.main().ExpensesButton)).click();
        //fail();
        extentLogger.pass("Login Test Passed...");

    }
}
