package com.Odoo_Expenses.pages.Humeyra;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseReportSummaryPage {

    @FindBy( xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]" )
    public WebElement expenseReportSummaryLink;
    @FindBy( xpath = "//div[@class='o_input_dropdown']/input" )
    public WebElement employeeLink;
    @FindBy( xpath = "//div//input[@class='o_input ui-autocomplete-input']" )
    public WebElement employeeNameLink;
    @FindBy( xpath = "//input[@class='o_input ui-autocomplete-input']" )
    public WebElement nameText;
    @FindBy( xpath = "(//li[@class='ui-menu-item'])[1]" )
    public WebElement name;

    public ExpenseReportSummaryPage() {

        PageFactory.initElements (Driver.getDriver (), this);
    }
}
