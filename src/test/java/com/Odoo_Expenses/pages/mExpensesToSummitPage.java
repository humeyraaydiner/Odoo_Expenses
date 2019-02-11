package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.Pages;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mExpensesToSummitPage  extends TestBase {
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

    @FindBy(xpath = "(//td[@class='o_td_label'])[5]/label")
    public WebElement billReferencesText;

    @FindBy(xpath = "(//td[@class='o_td_label'])[6]/label")
    public WebElement ExpensesDateText;

    @FindBy(xpath = "(//td[@class='o_td_label'])[9]/label")
    public WebElement SaleOrderText;

    @FindBy(xpath = "(//td[@class='o_td_label'])[14]//label")
    public WebElement total;

    @FindBy(xpath ="(//td[@class='o_td_label'])[15]//label" )
    public WebElement paymentBy;

    @FindBy(xpath = "//span[@class='o_stat_text']")
    public WebElement document;

    @FindBy(xpath = "//input[@id='o_field_input_20']")
    public WebElement defaultPrice;

    @FindBy(xpath = "//input[@id='o_field_input_27']")
    public WebElement EmployeeDropDawn;

    @FindBy(xpath = "//input[@id='o_field_input_19']")
    public WebElement productDropdown;


    public   void ExpensesClick(){

        //pages.login().signIn();
        LoginPage loginPage=new LoginPage();
        loginPage.signIn();

        BrowserUtils.wait(5);

        BrowserUtils.waitForPageToLoad(5000);
        MainPage mainPage=new MainPage();
        BrowserUtils.wait(5);
        mainPage.ExpensesButton.click();
        //pages.main().ExpensesButton.click();
    }
    public void clickCreate(){
        createButton.click();

    }

    public void clickImportButton(){

        importButton.click();
    }
}