package com.Odoo_Expenses.tests.smoke_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static com.Odoo_Expenses.utilities.BrowserUtils.verifyElementDisplayed;
import static org.testng.Assert.assertTrue;

public class ExpensesAnalysis extends TestBase {

    @Test
    public void verifyExpensesAnalysis(){
      //Verify system should able to display "Expenses Analysis" link under "Reporting" link  title
        // on left side of the page and is visible .

        extentLogger = report.createTest("Verify 'ExpensesAnalysis' displayed and clickable ");
        extentLogger.info("Sign in as an Expenses Manager");
        pages.login().signIn();
        BrowserUtils.wait(5);

        extentLogger.info("click on expenses button");
        pages.main().ExpensesButton.click();

        extentLogger.info("Verify 'Reporting' link is visible");
        BrowserUtils.verifyElementDisplayed(pages.expensesAnalysisPage().ReportingTitle);

        extentLogger.info("Verify 'Expenses Analysis' is visible");
        BrowserUtils.verifyElementDisplayed(pages.expensesAnalysisPage().ExpensesAnalysis);

        extentLogger.info("Verify 'Expenses Analysis' is clickable");
        pages.expensesAnalysisPage().ExpensesAnalysis.click();

    }
     @Test
    public void verifyMeasureDropDownButton(){
         //   Verify after clicking "Expenses Analysis"
         // user should able to use "Measure" dropdown button the left top under "All Expenses" title.
         extentLogger = report.createTest("Verify 'Measure' drop down button displayed and clickable ");

         pages.login().signIn();
         BrowserUtils.wait(5);
         pages.main().ExpensesButton.click();
         BrowserUtils.wait(5);
         pages.expensesAnalysisPage().ExpensesAnalysis.click();
        // BrowserUtils.wait(5);
         //BrowserUtils.waitForPageToLoad(10);
//        extentLogger.info("Verify 'Measure dropdown button' is displayed");
//       BrowserUtils.waitForVisibility(pages.expensesAnalysisPage().MeasureButton,10);
         extentLogger.info("verify 'Measure' dropdown button is visible");
         verifyElementDisplayed(pages.expensesAnalysisPage().MeasureButton);

         extentLogger.info("verify 'Measure' dropdown button is clickable");
         pages.expensesAnalysisPage().MeasureButton.click();



     }




}
