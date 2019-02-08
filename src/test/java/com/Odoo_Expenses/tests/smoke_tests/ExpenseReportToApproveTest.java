package com.Odoo_Expenses.tests.smoke_tests;
import com.Odoo_Expenses.pages.MainPage;
import com.Odoo_Expenses.utilities.ApplicationConstants;
import com.Odoo_Expenses.utilities.ConfigurationReader;
import com.Odoo_Expenses.utilities.TestBase;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ExpenseReportToApproveTest extends TestBase {
    @BeforeMethod
    public void test1() {
        extentLogger = report.createTest("Login Test");
        extentLogger.info("Sigin in logging page");

        pages.login().signIn();

        //extentLogger.info("click on expenses button");
        pages.main().ExpensesButton.click();

        assertEquals(pages.main().ExpensesButton.getText(),
                ApplicationConstants.MAIN_PAGE);

        extentLogger.info("main page is displayed");
        extentLogger.info(" test is passed");

        WebDriverWait wait = new WebDriverWait(driver, 5);


    }


    @Test
    public void test2() {


        extentLogger = report.createTest("expenses page Test");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        extentLogger.info("Click on 'Expenses'. ");

        pages.expenseReportsToApprovePage().Expense();


        assertEquals(pages.expenseReportsToApprovePage()

                .expense.getText(), ApplicationConstants.LIST_OF_ALL_PRODUCTS);


        extentLogger.info("Expenses  is displayed");

        extentLogger.info(" Test passed");

        extentLogger = report.createTest

                ("expenseReportsToApprovePage page Test");

        extentLogger.info("clicking on expenseReportsToApprovePage");

        pages.expenseReportsToApprovePage().ExpenseReportsToApp();

        assertEquals(pages.expenseReportsToApprovePage()

                .ExpenseReportsToApp.getText(), ApplicationConstants.EXPENSES_TO_REP);

        extentLogger.info(" expense Reports To ApprovePage is displayed");

        extentLogger.info("passed");

    }

    @Test
    public void test3() {
        //pages.login().signIn();
        // pages.main().ExpensesButton.click();

        pages.expensesPage().ExpenseReportsToApprove.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);

        pages.expenseReportsToApprovePage().create.click();


    }

    @Test
    public void test4() {


        pages.expensesPage().ExpenseReportsToApprove.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);

        pages.expenseReportsToApprovePage().create.click();

        WebDriverWait wait1 = new WebDriverWait(driver, 15);

pages.expenseReportsToApprovePage().Search.click();
    }
    @Test
    public void test5(){
        pages.expensesPage().ExpenseReportsToApprove.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        pages.expenseReportsToApprovePage().create.click();

        WebDriverWait wait1 = new WebDriverWait(driver, 15);

        pages.expenseReportsToApprovePage().eployee.click();

        WebDriverWait wait3 = new WebDriverWait(driver, 15);


        pages.expenseReportsToApprovePage().summarybox.click();

        pages.expenseReportsToApprovePage().

                summarybox.sendKeys("expense for lunch");

        WebDriverWait wait2 = new WebDriverWait(driver, 15);


        pages.expenseReportsToApprovePage().approve.click();



    }
    @Test
    public void test6(){
        pages.expensesPage().ExpenseReportsToApprove.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        pages.expenseReportsToApprovePage().create.click();

        WebDriverWait wait1 = new WebDriverWait(driver, 15);

        pages.expenseReportsToApprovePage().eployee.click();

        WebDriverWait wait3 = new WebDriverWait(driver, 15);


        pages.expenseReportsToApprovePage().summarybox.click();

        pages.expenseReportsToApprovePage().

                summarybox.sendKeys("expense for lunch");

        WebDriverWait wait2 = new WebDriverWait(driver, 15);


        pages.expenseReportsToApprovePage().refused.click();


    }
    @Test
    public void test7(){
        pages.expensesPage().ExpenseReportsToApprove.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);



        //pages.expenseReportsToApprovePage().create.click();

        pages.expenseReportsToApprovePage().Impo.click();
    }





}
