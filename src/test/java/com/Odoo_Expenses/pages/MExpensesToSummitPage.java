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

   //@FindBy(xpath = "(//div[@class='o_cp_left']/div/div/button)[1]//button[contains(text(),'Create']")
    //@FindBy(xpath = "//button[contains(text(),'Create']")

    @FindBy(xpath ="//*[@accesskey='c']" )
    public  WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_list_buttons']/button)[2]")
    public WebElement importButton;

    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/div)[8]")
    public WebElement MyExpensesTitle;

    @FindBy(xpath ="(//div[@class='o_sub_menu_content']/div/ul/li)[6]" )
    public WebElement ExpensesToSummitTitle;

    @FindBy(xpath = "(//label[@class='o_form_label'])[1]")

    public WebElement ExpenseDesciriptionText;

    @FindBy(xpath = "(//td[@class='o_td_label']//label)[1]")
    public WebElement productText;

    @FindBy(xpath = "(//td[@class='o_td_label'])[2]")
    public WebElement UnitPrice;


   // @FindBy(xpath ="(//li[@class='active'])[2]" )
    //public WebElement ExpensesToSummitTitle;

@FindBy(xpath = "(//td[@class='o_td_label'])[3]/label")
    public WebElement QuantityText;

@FindBy(xpath = "(//td[@class='o_td_label'])[6]/label")
    public WebElement EmployeeText;


}
