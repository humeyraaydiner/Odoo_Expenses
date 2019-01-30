package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage {
    public ExpensesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
