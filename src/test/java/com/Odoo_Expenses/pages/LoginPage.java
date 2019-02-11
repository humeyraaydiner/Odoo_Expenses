package com.Odoo_Expenses.pages;

import com.Odoo_Expenses.utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Sign in")
    public WebElement signInBtn;

    @FindBy(linkText = "BriteErpDemo")
    public WebElement demo;

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//button)[2]")
    public WebElement loginButton;
///////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[6]")
    public WebElement ExpensesButton;

    public void signIn()  {
        demo.click();
        email.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }

  public void expensesClick(){
        signIn();
     ExpensesButton.click();

    }

}
