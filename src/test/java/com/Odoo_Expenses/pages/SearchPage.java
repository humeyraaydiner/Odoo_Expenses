package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//input[@class='o_searchview_input']")
    public WebElement searchInput;

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public  WebElement advcancedSearch;

    @FindBy(xpath = "//div[@class='o_facet_values']")
    public WebElement defaultfilter;

    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement defaultfilterRemove;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement clickFilter;

    @FindBy(xpath = "(//a[@href='#'])[18]")
    public WebElement myExpensesDrDw;

    @FindBy(xpath = "(//a[@href='#'])[15]")
    public WebElement refusedDrDw;


    @FindBy(xpath = "(//span[@class='oe_menu_text'])[22]")
    public WebElement clickRefusedReports;

    @FindBy(xpath = "(//div[@class='o_sub_menu_content']/div/ul/li)[10]")
    public WebElement ExpensesAnalysis;





    /*





        page.searchFunctionality().allUpcominEvents.getText();
        extentLogger.pass("all Events ");

        page.searchFunctionality().allUpcominEvents.isDisplayed();
        extentLogger.pass("Events are Displyed True");

        extentLogger.info("user shoul be able to search by events name");
        page.searchFunctionality().searchBox.sendKeys("Event 1" + Keys.ENTER);
        extentLogger.pass("User Entered Events name and clicked On keyboard Enter button");
        extentLogger.info("Verify Expected Event is Displeyed");

        page.searchFunctionality().Event_1.isDisplayed();
        extentLogger.pass("Event is Displeyd as Expected");

     */


}
