package com.Odoo_Expenses.tests.smoke_tests;
import com.Odoo_Expenses.utilities.ApplicationConstants;
import com.Odoo_Expenses.utilities.ConfigurationReader;
import com.Odoo_Expenses.utilities.TestBase;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ExpenseReportToApproveTest extends TestBase{
    @BeforeMethod
    public void test1(){
        extentLogger=  report.createTest("Login Test");
        extentLogger.info("Sigin in logging page");

        pages.login().signIn();
        assertEquals(driver.getTitle(),
                ApplicationConstants.LOGIN_PAGE_TITLE);
        extentLogger.info("the loging page is displayed");
        extentLogger.info(" test is passed");
        // assertEquals(driver.getTitle(), ApplicationConstants.LOGIN_PAGE_TITLE);
        WebDriverWait wait = new WebDriverWait(driver,5);


    }



    @Test
    public void test2(){

        extentLogger=  report.createTest("expenses page Test");
        WebDriverWait wait = new WebDriverWait(driver,5);
        extentLogger.info("Click on 'Expenses'. ");

        pages.expenseReportsToApprovePage().Expense();
        assertEquals(driver.getTitle(),ApplicationConstants.APPLICATION_TITLE);
        extentLogger.info("Expenses  is displayed");
        extentLogger.info(" test pass");

        extentLogger=  report.createTest
                ("expenseReportsToApprovePage page Test");
        extentLogger.info("clicking on expenseReportsToApprovePage");
        pages.expenseReportsToApprovePage().ExpenseReportsToApp();
        assertEquals(driver.getTitle(),ApplicationConstants.EXPENSES_TO_REP);

        extentLogger.info(" expense Reports To ApprovePage is displayed");
        extentLogger.info("pass");

    }
}


