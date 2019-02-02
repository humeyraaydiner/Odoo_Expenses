package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MExpensesToSummitPage {
    public MExpensesToSummitPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".btn.btn-primary.btn-sm.o_list_button_add")
    public  WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/div)[8]")
    public WebElement MyExpensesTitle;

    @FindBy(xpath ="(//li[@class='active'])[3]" )
    public WebElement MyExpensesToSummitTitle;


    @FindBy(xpath ="(//li[@class='active'])[2]" )
    public WebElement ExpensesToSummitTitle;




}
