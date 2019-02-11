package com.Odoo_Expenses.tests.fuctional_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchFunctionalTest extends TestBase {
    public void easySteps(){

        extentLogger = report.createTest("verifyElementDisplay Test");
        extentLogger.info("Sing in as an expenses Menager");
        pages.login().signIn();
        BrowserUtils.wait(5);
        extentLogger.info(" Click on Expenses button");
        pages.main().ExpensesButton.click();
        BrowserUtils.wait(5);

        pages.searchPage().advcancedSearch.click();
        extentLogger.pass("clicked on advanced search button");
    }


    @Test(description = "BRIT 770")
    public void searchFilterButton() {
        easySteps();

        pages.searchPage().clickFilter.click();
       BrowserUtils.wait(2);
        extentLogger.info("Verify the search button has filter button");
        extentLogger.pass("Test Completed Successfully");

    }

    @Test(description = "BRIT 791")
    public void searchGroupByButton() {
        easySteps();
        pages.searchPage().groupBybutton.click();
         BrowserUtils.wait(2);
        extentLogger.info("Verify the search button has group By filter button");
        extentLogger.pass("Test Completed Successfully");


    }

    @Test(description = "BRIT 867")
    public void searchAddCustomFilter() {
        easySteps();

        pages.searchPage().clickFilter.click();
        BrowserUtils.wait(3);

        pages.searchPage().addCustomFilter.click();
        BrowserUtils.wait(3);
        extentLogger.info("Verify the search button has custom filter selection");
        extentLogger.pass("Test Completed Successfully");


    }


   @Test(description = "BRIT 889")
    public void searchFavorites() {
        easySteps();

        BrowserUtils.wait(2);
        pages.searchPage().favoritesButton.click();
        BrowserUtils.wait(3);
        extentLogger.info("Verify the search button has favorites selection");
        extentLogger.pass("Test Completed Successfully");


    }


    @Test(description = "BRIT 911")
    public void searchAddToDashBoard() {
        easySteps();
        BrowserUtils.wait(2);

        pages.searchPage().favoritesButton.click();
        BrowserUtils.wait(3);

        pages.searchPage().addtoDashboard.click();
        BrowserUtils.wait(3);
        extentLogger.info("Verify the search has add to dashboard  button");
        extentLogger.pass("Test Completed Successfully");


    }

    @Test(description = "BRIT 921 ")
    public void saveCurrentSearch() {
        easySteps();

        pages.searchPage().favoritesButton.click();
        BrowserUtils.wait(3);

        pages.searchPage().saveCurrentSearch.click();
        BrowserUtils.wait(3);
        extentLogger.info("Verify the search button can save searched items on expenses");
        extentLogger.pass("Test Completed Successfully");


    }

    @Test(description = "BRIT 939")
    public void addCustomGoup() {
        easySteps();

        pages.searchPage().groupBybutton.click();
        BrowserUtils.wait(3);

        pages.searchPage().addCustomGroup.click();
        BrowserUtils.wait(3);
        extentLogger.info("Verify the search button can add custom group under group by button");
        extentLogger.pass("Test Completed Successfully");


    }

}

