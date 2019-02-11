package com.Odoo_Expenses.tests.fuctional_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.Pages;
import com.Odoo_Expenses.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ExpensesAnalysis_functional extends TestBase {

@Test
    public void Brit_1557 () {
// Verify "Create" button is clickable and active.
    extentLogger = report.createTest("Verify 'Create ' clickable and active ");
    pages.login().expensesClick();
    pages.expensesAnalysisPage().ExpensesAnalysis.click();

    extentLogger.info("Verify 'ListIcon' is clickable");
    pages.expensesAnalysisPage().ListIcon.click();
    BrowserUtils.wait(2);
    extentLogger.info("verify 'Create Button' is clickable");
    pages.expensesAnalysisPage().CreateButton.click();
    extentLogger.info("Verify 'Expesnse Description");
    BrowserUtils.verifyElementDisplayed(pages.expensesAnalysisPage().ExpenseForm);
}
@Test
    public void Brit_1560 () {

        pages.login().expensesClick();

        pages.expensesAnalysisPage().ExpensesAnalysis.click();
        pages.expensesAnalysisPage().ListIcon.click();
        BrowserUtils.wait(5);
        pages.expensesAnalysisPage().CreateButton.click();
        BrowserUtils.wait(5);

        extentLogger=report.createTest("Verify fields are able to be filled ");
        extentLogger.info("verify 'Expense Descriprtion' is able to be filled");
        BrowserUtils.verifyElementDisplayed(pages.expensesAnalysisPage().ExpenseDescription);
        pages.expensesAnalysisPage().ExpenseDescription.sendKeys("Lunch with Customer");

        BrowserUtils.wait(5);

        extentLogger.info("Verify 'Product' field ");
       pages.expensesAnalysisPage().Product.click();
       BrowserUtils.wait(5);
       pages.expensesAnalysisPage().MenuItemExpense.click();

       BrowserUtils.wait(5);
       pages.expensesAnalysisPage().Employee.click();
       pages.expensesAnalysisPage().MenuItemEmployee.click();

       pages.expensesAnalysisPage().SaveButton.click();












    }


    }
















