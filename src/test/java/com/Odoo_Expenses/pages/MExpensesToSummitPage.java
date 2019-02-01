package com.Odoo_Expenses.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MExpensesToSummitPage {


    @FindBy(css = "\".btn.btn-primary.btn-sm.o_list_button_add\"")

    public  WebElement createButton;

   // @FindBy(css=".btn.btn-sm.btn-default.o_button_import");

    public WebElement importButton;
}
