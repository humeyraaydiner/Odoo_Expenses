package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportButtonForOfficer {
    public ImportButtonForOfficer  () {
        PageFactory.initElements ( Driver.getDriver (), this);
    }
    @FindBy(xpath = "(//div[@class='o_list_buttons']/button)[2]")
    public WebElement importButton;

    @FindBy(xpath = "//span[@class='input-group-btn']/label/input")
    public WebElement load;
}
