package com.Odoo_Expenses.tests.smoke_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @Test
    public void verifySearchProduct() {
        extentLogger = report.createTest("verifyElementDisplay Test");
        extentLogger.info("Sing in as an expenses Menager");
        pages.login().signIn();
        BrowserUtils.wait(5);
        extentLogger.info(" Click on Expenses button");
        pages.main().ExpensesButton.click();
        BrowserUtils.wait(5);

        pages.searchPage().advcancedSearch.click();
        extentLogger.pass("clicked on advanced search button");

        pages.searchPage().defaultfilter.click();
        extentLogger.pass("Clicked o Default Filter button");

        pages.searchPage().defaultfilterRemove.click();
        extentLogger.pass(("Default filter removed"));

        extentLogger.info("user shoul be able to search by expenses product by name");
        pages.searchPage().searchInput.sendKeys("Car" + Keys.ENTER);
        extentLogger.pass("User Entered expenses  name and clicked On keyboard Enter button");
        extentLogger.info("Verify system did not print out anything");

    }
    @Test
        public void  advancedSearch(){
        extentLogger = report.createTest("verifyElementDisplay Test");
        extentLogger.info("Sing in as an expenses Menager");
        pages.login().signIn();
        BrowserUtils.wait(5);
        extentLogger.info(" Click on Expenses button");
        pages.main().ExpensesButton.click();
        BrowserUtils.wait(5);

        pages.searchPage().advcancedSearch.click();
        extentLogger.pass("clicked on advanced search button");

        pages.searchPage().clickFilter.click();
        extentLogger.pass("Clicked filter");

        pages.searchPage().myExpensesDrDw.click();
        extentLogger.pass("Clicked My Expenses from DropDown");

        pages.searchPage().refusedDrDw.click();
        extentLogger.pass("Clicked Refused from from DropDown");

        pages.searchPage().clickFilter.click();
        extentLogger.pass("Clicked filter");
        extentLogger.info("Verify by filter system did not show any reports");



    }

    }

