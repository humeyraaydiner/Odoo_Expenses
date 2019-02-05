package com.Odoo_Expenses.pages;


import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ExpenseReportsToApprovePage {
    public ExpenseReportsToApprovePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Expenses")
    public WebElement expense;

    @FindBy(linkText = "Expense Reports To Approve")
    public WebElement ExpenseReportsToApp;


    @FindBy(xpath = "//button[contains(text(),'Create']")
    public WebElement create;

    @FindBy(xpath = "(//button[contains(text(),'Import']")
    public WebElement Impo;

    @FindBy(className = "o_searchview_input")
    public WebElement Search;

    public void Expense(){
        expense.click();

    }
    public void ExpenseReportsToApp(){
        ExpenseReportsToApp.click();
    }

}





