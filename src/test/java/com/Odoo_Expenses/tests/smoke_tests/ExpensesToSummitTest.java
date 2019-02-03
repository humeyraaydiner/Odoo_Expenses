package com.Odoo_Expenses.tests.smoke_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.Odoo_Expenses.tests.smoke_tests.loginTest;


public class ExpensesToSummitTest extends TestBase {
    @Test

    public void ExpensesToSummit()  {
        pages.login().signIn();

        //BrowserUtils.waitForPageToLoad(5000);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("o_loading")));

        // wait.until(ExpectedConditions.visibilityOf(pages.main().ExpensesButton)).click();

        pages.main().ExpensesButton.click();

        //BrowserUtils.wait(0);

//        extentLogger = report.createTest("ExpensesToSummitTest");
//
//        extentLogger.info("verifyElementDisplay()");

        BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().MyExpensesTitle);

    }















}

