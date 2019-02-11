package com.Odoo_Expenses.pages;

        import com.Odoo_Expenses.utilities.BrowserUtils;
        import com.Odoo_Expenses.utilities.Driver;
        import com.Odoo_Expenses.utilities.Pages;
        import com.Odoo_Expenses.utilities.TestBase;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends TestBase {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[6]")
    public WebElement ExpensesButton;




}
