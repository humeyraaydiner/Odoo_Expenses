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

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[4]")
    public WebElement groupBybutton;

    @FindBy(xpath = "//li[@class='o_add_filter o_closed_menu']")
    public WebElement addCustomFilter;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[5]")
    public WebElement favoritesButton;

    @FindBy(xpath = "(//li[@class='o_add_to_dashboard_link o_closed_menu'])")
   public WebElement addtoDashboard;

    @FindBy(xpath = "(//li[@class='o_save_search o_closed_menu'])")
    public WebElement saveCurrentSearch;

    @FindBy(xpath = "(//li[@class='o_add_custom_group o_closed_menu'])")
    public WebElement addCustomGroup;












}
