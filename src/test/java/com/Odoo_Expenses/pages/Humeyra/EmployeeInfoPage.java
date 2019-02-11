package com.Odoo_Expenses.pages.Humeyra;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeInfoPage {

    @FindBy( xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[1]" )
    public WebElement nameInfoButton;
    @FindBy( xpath = "//div//h1//span[@name='name']" )
    public WebElement nameTitle;
    @FindBy( xpath = "//button[@class='btn btn-sm btn-default o_form_button_cancel']/span" )
    public WebElement nameInfoButtonClose;

    public EmployeeInfoPage() {
        PageFactory.initElements (Driver.getDriver (), this);
    }

}
