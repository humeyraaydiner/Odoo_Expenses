package com.Odoo_Expenses.tests.smoke_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.TestBase;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @Test
    public void verifySearchFunc(){
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
 /*




*/
    }
}
