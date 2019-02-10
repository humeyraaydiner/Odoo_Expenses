package com.Odoo_Expenses.tests.smoke_tests;
import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.TestBase;
import org.testng.annotations.Test;

public class ExpenseReportTest extends TestBase {


    @Test
    public void expenseReportSetTest() {
        extentLogger = report.createTest("verifyElementDisplay Test");
        extentLogger.info("Sing in as an expenses Menager");
        pages.login().signIn();
        extentLogger.info("Verify the application entering page displayed");
        BrowserUtils.wait(5);
        pages.expenseReportPage().expensesLink.click();
        extentLogger.info("Verify 'Expenses' functionality is visible");
        BrowserUtils.wait(5);
        pages.expenseReportPage().expenseReportLink.click();
        extentLogger.info("Verify 'ExpensesReportLink' functionality is visible");
        BrowserUtils.wait(5);
        pages.expenseReportPage().createButton.click();
        extentLogger.info("Create button is clickable");
//
    }

    @Test
    public void setExpenseReportSummary() {
        extentLogger = report.createTest("verifyElementDisplay Test");
        extentLogger.info("Sing in as an expenses Menager");
        pages.login().signIn();
        extentLogger.info("Verify the application entering page displayed");
        pages.expenseReportPage().expensesLink.click();
        extentLogger.info("Verify 'Expenses' functionality is visible");
        pages.expenseReportPage().expenseReportLink.click();
//        extentLogger.info("Verify 'ExpensesReportLink' functionality is visible");
        BrowserUtils.wait(5);
        pages.expenseReportPage().createButton.click();
//        extentLogger.info("Create button is clickable");
        BrowserUtils.wait(4);
        pages.expenseReportSummaryPage().expenseReportSummaryLink.sendKeys("Travel");
        // extentLogger.info("Verify Travel keyworrd is sent into the search button");
        pages.expenseReportSummaryPage().employeeLink.click();
        extentLogger.info(" employeeName dropDown is displayed");
        BrowserUtils.wait(7);
        // BrowserUtils.hover (pages.expenseReportPage ().expensesLink);
        pages.expenseReportSummaryPage().employeeNameLink.click();
        extentLogger.info(" employeeNameLink is displayed");
        BrowserUtils.wait(3);
    }

    @Test
    public void setEmployeeInfoPage() {
        extentLogger = report.createTest("verifyElementDisplay Test");
        extentLogger.info("Sing in as an expenses Menager");
        pages.login().signIn();
        extentLogger.info("Verify the application entering page displayed");
        pages.expenseReportPage().expensesLink.click();
        extentLogger.info("Verify 'Expenses' functionality is visible");
        pages.expenseReportPage().expenseReportLink.click();
//        extentLogger.info("Verify 'ExpensesReportLink' functionality is visible");
        BrowserUtils.wait(5);
        pages.expenseReportPage().createButton.click();
//        extentLogger.info("Create button is clickable");
        BrowserUtils.wait(4);
        pages.expenseReportSummaryPage().expenseReportSummaryLink.sendKeys("Travel");
        // extentLogger.info("Verify Travel keyworrd is sent into the search button");
        pages.expenseReportSummaryPage().employeeLink.click();
        extentLogger.info(" employeeName dropDown is displayed");
        BrowserUtils.wait(7);
        // BrowserUtils.hover (pages.expenseReportPage ().expensesLink);
        pages.expenseReportSummaryPage().employeeNameLink.click();
        extentLogger.info(" employeeNameLink is displayed");
        BrowserUtils.wait(3);
        pages.employeeInfoPage().nameInfoButton.click();
        extentLogger.info("employeeInfoPage button is clickable");
        pages.employeeInfoPage().nameTitle.isDisplayed();
        extentLogger.info("employeeInfoPage nameTitle is displayed");
        pages.employeeInfoPage().nameInfoButtonClose.click();
        extentLogger.info("employeeInfoPage nameInfoButtonClose is clickable");
    }
// @Test

}