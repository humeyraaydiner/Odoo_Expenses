package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage {
    public ExpensesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/ul/li)[6]")

    public WebElement ExpensesToSubmit;



    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]")

    public WebElement RefusedReport;


    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[15]")

    public WebElement ExpenseReports;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[16]")

    public WebElement ExpenseReportsToApprove;


    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[17]")

    public WebElement ExpensesAnalysis;

    @FindBy(xpath = "//input[@class='o_searchview_input']")

    public WebElement Search;


}
