package com.Odoo_Expenses.tests.smoke_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Odoo_Expenses.tests.smoke_tests.loginTest;


public class ExpensesToSummitTest extends TestBase {

    @Test
    public void verifyElementDisplay()  {
        ////Brit 131--->Verify that "Expenses to Summit" functionality is visiable

        pages.login().signIn();

        BrowserUtils.wait(5);
        pages.main().ExpensesButton.click();


   String aa= Driver.getDriver().findElement(By.xpath("(//div[@class='o_sub_menu_content']/div/div)[8]")).getText();
     System.out.println(aa);

        BrowserUtils.wait(5);




        //BrowserUtils.wait(5);

       // System.out.println(pages.mExpensesToSummitPage().MyExpensesTitle.getText());
      // Assert.assertEquals(pages.mExpensesToSummitPage().MyExpensesTitle.getText(),MyExpensesText);

        BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().MyExpensesTitle);


        System.out.println("aaa");


    }

}
