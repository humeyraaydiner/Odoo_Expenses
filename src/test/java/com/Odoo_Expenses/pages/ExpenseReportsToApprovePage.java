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


    @FindBy(xpath = "//button[@accesskey='c']")
    //@FindBy(linkText = "Create")
    //@FindBy(xpath = "//div[@class='o_list_buttons']/button[@accesskey='c']")
    public WebElement create;

    //@FindBy(xpath = "(//button[contains(text(),'Import']")
    //@FindBy(xpath = "(//button [@type='button'])[22]")
    @FindBy(xpath = "//button[@class='.Import']")
    public WebElement Impo;

    @FindBy(className = "o_searchview_input")
    public WebElement Search;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement save;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement summarybox;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement eployee;
    @FindBy(xpath = "//button [@class='btn btn-sm btn-default'][1]")
    public WebElement approve;


    @FindBy(xpath = "//button [@class='btn btn-sm btn-default'][5]")
    public WebElement refused;


    public void Expense() {
        expense.click();

    }
   public void ExpenseReportsToApp(){
        ExpenseReportsToApp.click();
   }

}





