package com.Odoo_Expenses.tests.smoke_tests;

import com.Odoo_Expenses.pages.MExpensesToSummitPage;
import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Odoo_Expenses.tests.smoke_tests.loginTest;

import java.sql.SQLOutput;


public class ExpensesToSummitTest extends TestBase {

    @Test
    public void verifyElementDisplay()  {

        extentLogger = report.createTest("verifyElementDisplay Test");

        extentLogger.info("Sing in as an expenses Menager");

        pages.login().signIn();

        BrowserUtils.wait(5);

        extentLogger.info(" Click on Expenses button");
        pages.main().ExpensesButton.click();

        BrowserUtils.wait(5);



        //BrowserUtils.wait(5);

       // System.out.println(pages.mExpensesToSummitPage().MyExpensesTitle.getText());
      // Assert.assertEquals(pages.mExpensesToSummitPage().MyExpensesTitle.getText(),MyExpensesText);


        extentLogger.info("verify 'MY Expenses' functionality is visible ");
        BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().MyExpensesTitle);


        extentLogger.info("verify 'Expenses to Summit' functionality is visible ");
        BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().ExpensesToSummitTitle);

        extentLogger.info("Verify that import functinalty is visisable");
        BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().importButton);

    }

    @Test
    public void ExpensesToSummit() {
        pages.login().signIn();

        //BrowserUtils.waitForPageToLoad(5000);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("o_loading")));

        // wait.until(ExpectedConditions.visibilityOf(pages.main().ExpensesButton)).click();

        pages.main().ExpensesButton.click();

        //BrowserUtils.wait(0);

//        extentLogger = report.createTest("ExpensesToSummitTest");
//
//        extentLogger.info("verifyElementDisplay()");

        BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().MyExpensesTitle);

    }
    @Test
    public void verifyCreateFunctionality(){

        pages.login().signIn();

        BrowserUtils.wait(5);

        pages.main().ExpensesButton.click();

        Driver.getDriver().manage().window().maximize();
        BrowserUtils.wait(5);


        extentLogger = report.createTest("verifyCreateFunctionality Test ");
        extentLogger.info("Verify that create button is visiable");

        System.out.println(pages.mExpensesToSummitPage().createButton.isDisplayed());


        extentLogger.info("create button is clickable");
        pages.mExpensesToSummitPage().createButton.click();
   }
@Test
    public void verifyImportFunctionality(){

    pages.login().signIn();

    BrowserUtils.wait(5);

    pages.main().ExpensesButton.click();

    BrowserUtils.wait(5);
    Driver.getDriver().manage().window().maximize();

    extentLogger = report.createTest("verifyImportFunctionality Test");
    extentLogger.info("Verify That import button is visiable");

    System.out.println(pages.mExpensesToSummitPage().createButton.isDisplayed());

    extentLogger.info("Verify that import button is clickable");





}
@Test
    public void ExpenseDescriptionTest(){
    verifyCreateFunctionality();
    extentLogger = report.createTest("Expense Desciription Table Test");
    extentLogger.info("Verify That Expense Desciription  text is visiable");

//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.c));
     BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().ExpenseDesciriptionText);
     System.out.println("ExpenseDesciription text is display");

     extentLogger.info("product  text is visiable");
     BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().productText);

     extentLogger.info("unit Price text is visiable");
    // BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().UnitPrice);

    System.out.println(pages.mExpensesToSummitPage().UnitPrice.isDisplayed());




}

}

