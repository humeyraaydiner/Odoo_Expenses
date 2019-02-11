package com.Odoo_Expenses.tests.smoke_tests;


import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import static com.Odoo_Expenses.utilities.BrowserUtils.verifyElementDisplayed;
import static com.Odoo_Expenses.utilities.BrowserUtils.waitForClickablility;


public class refusedReportsTest extends TestBase {

    @Test
    public void refusedReportsTabTest() throws InterruptedException {

        extentLogger = report.createTest("Refused Report tab test");
        extentLogger.info("Signing in...");

        // pages.refusedReport().signIn();

        pages.login().signIn();
        BrowserUtils.wait(5);
        extentLogger.info("Navigating to Expenses tab");
        pages.refusedReport().clickExpensesTab();

        extentLogger.info("Clicking on Refused Reports tab");
        pages.refusedReport().clickRefusedReportTab();

        Assert.assertEquals(pages.refusedReport().text.getText(), "My Refused Reports");
        extentLogger.pass("Passed: Refused Report Tab Test");

    }

    @Test
    public void VerifyKanbanFunctionalityTest() {

        extentLogger = report.createTest("kanban functionality test");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();


        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickKanbanButton();

        String displayMsg3 = pages.refusedReport().getDisplayMsg3();
        String actualMsg = "No refused reports to display.";
        Assert.assertEquals(displayMsg3, actualMsg);
        extentLogger.pass("Passed: Kanban functionality test");


    }

    @Test
    public void VerifyGraphFunctionalityTest() {
        extentLogger = report.createTest("graph functionality test");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickGraphButton();

        String displayMsg = pages.refusedReport().getDisplayMsg();
        String actualMsg = "No data to display";
        Assert.assertEquals(displayMsg, actualMsg);
        extentLogger.pass("Passed: Graph Functionality Test");

    }

    @Test
    public void VerifyPivotFunctionalityTest() {
        extentLogger = report.createTest("pivot functionality test");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickPivotButton();

        String displayMsg2 = pages.refusedReport().getDisplayMsg2();
        String actualMsgg = "No data to display.";
        Assert.assertEquals(displayMsg2, actualMsgg);
        extentLogger.pass("Passed: pivot Functionality Test");

    }

    @Test
    public void VerifyMeasureChart() {
        extentLogger = report.createTest("measures data functionality ");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickGraphButton();

        String displayMsg4 = pages.refusedReport().getDisplayMsg4();
        String actualMsggg = "No data available for this chart. Try to add some records, or make sure that there is no active filter in the search bar.";
        Assert.assertEquals(displayMsg4, actualMsggg);
        extentLogger.pass("Message displayed");

        extentLogger.info("verify measures dropdown button is visible");
        verifyElementDisplayed(pages.refusedReport().measuresButton);

        extentLogger.info("verify measures dropdown button is clickable");
        //BrowserUtils.wait(5);
        pages.refusedReport().clickMeasuresButton();

    }

    @Test
    public void VerifyDataChart() {
        extentLogger = report.createTest("data functionality ");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickGraphButton();

        extentLogger.info("verify pie chart is clickable");
        pages.refusedReport().clickPieChart();


    }

    @Test
    public void VerifyDataChart1() {
        extentLogger = report.createTest("data functionality ");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickGraphButton();

        extentLogger.info("verify line chart is clickable");
        pages.refusedReport().clickLineChart();
    }

    @Test
    public void VerifyDataChart2() {
        extentLogger = report.createTest("data functionality ");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickGraphButton();

        extentLogger.info("verify bar chart is clickable");
        pages.refusedReport().clickBarChart();
    }

    @Test
    public void VerifyDataChart3() {
        extentLogger = report.createTest("data functionality ");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickPivotButton();

        extentLogger.info("verify flip axis arrow is clickable");
        pages.refusedReport().clickFlipAxis();

    }

    @Test
    public void VerifyDataChart4() {
        extentLogger = report.createTest("data functionality ");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickPivotButton();

        extentLogger.info("verify Expand all arrow is clickable");
        pages.refusedReport().clickExpandAll();
    }

    @Test
    public void VerifyDataChart5() {
        extentLogger = report.createTest("data functionality ");

        pages.login().signIn();
        BrowserUtils.wait(5);
        BrowserUtils.waitForClickablility(pages.main().ExpensesButton, 5);
        pages.main().ExpensesButton.click();

        pages.refusedReport().clickRefusedReportTab();
        BrowserUtils.wait(5);
        pages.refusedReport().clickPivotButton();

        extentLogger.info("verify Download xls is clickable");
        pages.refusedReport().clickDownloadXls();
    }
}
