package com.Odoo_Expenses.tests.smoke_tests;


import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.Odoo_Expenses.utilities.BrowserUtils.verifyElementDisplayed;


public class refusedReportsTest extends TestBase {

    @Test
    public void refusedReportsTabTest() throws InterruptedException {

        extentLogger=report.createTest("Refused Report tab test");
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


//        extentLogger.info("verify verify Kanban functionality is visible");
//        BrowserUtils.wait(5);
//        verifyElementDisplayed(pages.refusedReport().kanbanButton );
//        extentLogger.info("verify kanban button is clickable");
//        pages.refusedReport().kanbanButton.click();
    }
        @Test
         public void VerifyGraphFunctionalityTest(){
            extentLogger = report.createTest("graph functionality test");

            pages.login().signIn();
            BrowserUtils.wait(5);
            BrowserUtils.waitForClickablility(pages.main().ExpensesButton,5);
            pages.main().ExpensesButton.click();

            pages.refusedReport().clickRefusedReportTab();
            BrowserUtils.wait(5);
            pages.refusedReport().clickGraphButton();

            String displayMsg=pages.refusedReport().getDisplayMsg();
            String actualMsg= "No data to display";
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

//            extentLogger.info("verify pivot button is visible");
//            verifyElementDisplayed(pages.refusedReport().pivotButton );
//            extentLogger.info("verify pivot button is clickable");
//            pages.refusedReport().pivotButton.click();
//
//            @Test
//            public void VerifyDataChart(){
//               extentLogger = report.createTest("data functionality ");
//
//                pages.login().signIn();
//                BrowserUtils.wait(5);
//                BrowserUtils.waitForClickablility(pages.main().ExpensesButton,5);
//                pages.main().ExpensesButton.click();
//
//                pages.refusedReport().clickRefusedReportTab();
//                BrowserUtils.wait(5);
//                pages.refusedReport().clickGraphButton();
//
//                String displayMsg=pages.refusedReport().getDisplayMsg();
//                String actualMsg= "No data to display";
//                Assert.assertEquals(displayMsg, actualMsg);
//                extentLogger.pass("Passed: Graph Functionality Test");


    }

