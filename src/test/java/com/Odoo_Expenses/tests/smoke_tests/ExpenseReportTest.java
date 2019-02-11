package com.Odoo_Expenses.tests.smoke_tests;
import com.Odoo_Expenses.pages.OpenTheOfficerPage;
import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.TestBase;
import org.testng.Assert;
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
        BrowserUtils.wait ( 3 );
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
        BrowserUtils.wait ( 4 );
       // BrowserUtils.waitForClickablility ( pages.expenseReportPage ().expenseReportLink,2 );
        pages.expenseReportPage().expenseReportLink.click();
        extentLogger.info("Verify 'ExpensesReportLink' functionality is visible");
        BrowserUtils.wait(3);
        pages.expenseReportPage().createButton.click();
        extentLogger.info("Create button is clickable");
     //  clickable BrowserUtils.
        pages.expenseReportSummaryPage().expenseReportSummaryLink.sendKeys("Travel");
         extentLogger.info("Verify Travel keyworrd is sent into the search button");
        BrowserUtils.wait ( 5 );
        pages.expenseReportSummaryPage().employeeLink.click();
        extentLogger.info(" employeeName dropDown is displayed");
        BrowserUtils.wait(7);
        // BrowserUtils.hover (pages.expenseReportPage ().expensesLink);
        pages.expenseReportSummaryPage().ashley.click();
        extentLogger.info(" employeeNameLink is displayed");
        BrowserUtils.wait(3);
        pages.employeeInfoPage().nameInfoButton.click();
        extentLogger.info("employeeInfoPage button is clickable");
        BrowserUtils.wait ( 3 );
        pages.employeeInfoPage().nameTitle.click ();
        extentLogger.info("employeeInfoPage nameTitle is displayed");
        BrowserUtils.wait ( 2 );
        pages.employeeInfoPage().nameInfoButtonClose.click();
        extentLogger.info("employeeInfoPage nameInfoButtonClose is clickable");
    }


    @Test
    public void setDefaultInfoTest ( ) {


        extentLogger = report.createTest("verifyElementDisplay Test");
        extentLogger.info("Sing in as an expenses Menager");
        pages.login().signIn();
        extentLogger.info("Verify the application entering page displayed");
        pages.expenseReportPage().expensesLink.click();
        extentLogger.info("Verify 'Expenses' functionality is visible");
        BrowserUtils.wait ( 7 );
        // BrowserUtils.waitForClickablility ( pages.expenseReportPage ().expenseReportLink,2 );
        pages.expenseReportPage().expenseReportLink.click();
        extentLogger.info("Verify 'ExpensesReportLink' functionality is visible");
        BrowserUtils.wait(7);
        pages.expenseReportPage().createButton.click();
        extentLogger.info("Create button is clickable");
        pages.expenseReportSummaryPage ().approveButton.click ();
        extentLogger.info("approve button is clickable and came out to pop up");
        Assert.assertTrue (  pages.expenseReportSummaryPage ().popup.isDisplayed ());

    }
    @Test
    public void  openTheOfficerFunctionality(){

        OpenTheOfficerPage openTheOfficerPage = new OpenTheOfficerPage ();

        extentLogger = report.createTest ( "verifyElementDisplay Test" );
        extentLogger.info ( "Sing in as an expenses Menager" );
        pages.login ( ).signIn ( );
        extentLogger.info ( "Verify the application entering page displayed" );
        openTheOfficerPage.ExpensesManagerLink.click ();
        extentLogger.info ( "ExpensesManagerLink is clickable" );
        BrowserUtils.waitForVisibility ( openTheOfficerPage.logOutScroll,2 );
        openTheOfficerPage.logOutScroll.click ();
        extentLogger.info ( "System is logout turn on the new site" );
        openTheOfficerPage.emailButton.sendKeys ( "in_ex_officer2@info.com" );
        extentLogger.info ( "user should displayed to email address on the button" );
        openTheOfficerPage.passwordButton.sendKeys ( "LLighg94" );
        extentLogger.info ( "user should displayed to password key" );
        openTheOfficerPage.loginButton.click ();
        extentLogger.info ( "user should displayed to officer page functionally" );

    }
    @Test
    public void officerFunctionally(){

        OpenTheOfficerPage openTheOfficerPage = new OpenTheOfficerPage ();
        extentLogger = report.createTest ( "verifyElementDisplay Test" );
        extentLogger.info ( "Sing in as an expenses Menager" );
        pages.login ( ).signIn ( );
        extentLogger.info ( "Verify the application entering page displayed" );
        openTheOfficerPage.ExpensesManagerLink.click ();
        extentLogger.info ( "ExpensesManagerLink is clickable" );
        BrowserUtils.waitForVisibility ( openTheOfficerPage.logOutScroll,2 );
        openTheOfficerPage.logOutScroll.click ();
        extentLogger.info ( "System is logout turn on the new site" );
        BrowserUtils.wait ( 3 );
        openTheOfficerPage.emailButton.sendKeys ( "in_ex_officer2@info.com" );
        extentLogger.info ( "user should displayed to email address on the button" );
        openTheOfficerPage.passwordButton.sendKeys ( "LLighg94" );
        extentLogger.info ( "user should displayed to password key" );
        openTheOfficerPage.loginButton.click ();
        extentLogger.info ( "user should displayed to officer page functionally" );
        BrowserUtils.wait ( 2 );
        pages.expenseReportPage ().expensesLink.click ();
        extentLogger.info ( "user should displayed to My Expenses to Submit functionally" );
        BrowserUtils.wait ( 7 );
        openTheOfficerPage.importButton.click ();
        BrowserUtils.wait ( 5 );
       Assert.assertTrue (openTheOfficerPage.Select_CSV_Excel_import.isDisplayed ());




    }





}