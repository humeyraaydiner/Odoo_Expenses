package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTheOfficerPage {

    public OpenTheOfficerPage  () {
        PageFactory.initElements ( Driver.getDriver (), this);
    }
    @FindBy(xpath = "(//a[@class='dropdown-toggle']/span)[1]")
    public WebElement ExpensesManagerLink;

    @FindBy(xpath = "(//ul[@class='dropdown-menu']/li/a)[5]")
    public WebElement logOutScroll;

    @FindBy(xpath = "(//div[@class='list-group']/a)[2]")
     public WebElement brite;

    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailButton;

    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordButton;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement loginButton;

    @FindBy( xpath = "//a[@href='/web#menu_id=392&action=544']/span" )
    public WebElement expenseReportLink;

    @FindBy( xpath = "//div[@class='o_list_buttons']/button[@accesskey='c']" )
    public WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_list_buttons']/button)[2]")
    public WebElement importButton;

    @FindBy(xpath = "//div[@class='col-sm-12']/p")
    public WebElement Select_CSV_Excel_import;
}
