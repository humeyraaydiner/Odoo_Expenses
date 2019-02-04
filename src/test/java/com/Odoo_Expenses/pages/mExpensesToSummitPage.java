package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mExpensesToSummitPage {
    public mExpensesToSummitPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   //@FindBy(xpath = "(//div[@class='o_cp_left']/div/div/button)[1]//button[contains(text(),'Create']")
    //@FindBy(xpath = "//button[contains(text(),'Create']")


//    @FindBy(css = "\".btn.btn-primary.btn-sm.o_list_button_add\"")
//
//    public  WebElement createButton;
//
//   // @FindBy(css=".btn.btn-sm.btn-default.o_button_import");
//
//    public WebElement importButton;
@FindBy(xpath = "(//div[@class='oe_secondary_menu_section']/div/div[8]")
public WebElement MyExpensesTitle;


    @FindBy(xpath ="//*[@accesskey='c']" )
    public  WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_list_buttons']/button)[2]")
    public WebElement importButton;

//    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/div)[8]")
//    public WebElement MyExpensesTitle;

    @FindBy(xpath ="(//div[@class='o_sub_menu_content']/div/ul/li)[6]" )
    public WebElement ExpensesToSummitTitle;


   // @FindBy(xpath ="(//li[@class='active'])[2]" )
    //public WebElement ExpensesToSummitTitle;





}
