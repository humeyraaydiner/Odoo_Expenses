package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseReportPage {

    public ExpenseReportPage() {
        PageFactory.initElements (Driver.getDriver (), this);
    }

    @FindBy( xpath = "//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[9]/a/span" )
    public WebElement expensesLink;
    @FindBy( xpath = "//a[@href='/web#menu_id=392&action=544']/span" )
    public WebElement expenseReportLink;
    @FindBy( xpath = "//div[@class='o_list_buttons']/button[@accesskey='c']" )
    public WebElement createButton;



}


//div//button[@class='btn btn-primary btn-sm o_list_button_add']