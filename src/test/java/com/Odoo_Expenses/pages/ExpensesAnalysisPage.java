package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesAnalysisPage {
    public ExpensesAnalysisPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/div)[10]")
    public WebElement ReportingTitle;

    //@FindBy(xpath = "(//a[@class='oe_menu_leaf'])[17]")
    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/ul/li)[10]")
    public WebElement ExpensesAnalysis;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm dropdown-toggle']/span)")
    //@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button")
    public WebElement MeasureButton;



}
