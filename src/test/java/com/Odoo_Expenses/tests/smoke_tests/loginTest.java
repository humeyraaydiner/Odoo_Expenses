package com.Odoo_Expenses.tests.smoke_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginTest extends TestBase {
    // we do not need to call login test method from that class
    @Test
    public void logInTest() throws InterruptedException {

        extentLogger = report.createTest("Login Test.");
        extentLogger.info("Sign in");
        pages.login().signIn();


        WebDriverWait wait = new WebDriverWait(driver, 10);
        extentLogger.info("Click on 'Expenses'. ");

        // Thread.sleep(5000);
        BrowserUtils.waitForPageToLoad(5000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("o_loading")));
        wait.until(ExpectedConditions.visibilityOf(pages.main().ExpensesButton)).click();
        //fail();
        extentLogger.pass("Login Test Passed...");

    }
}
