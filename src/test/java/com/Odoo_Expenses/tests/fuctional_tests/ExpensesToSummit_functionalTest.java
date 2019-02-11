package com.Odoo_Expenses.tests.fuctional_tests;

import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.Driver;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpensesToSummit_functionalTest extends TestBase {
   @Test
    public void ExpenseDescriptionTable(){

       pages.mExpensesToSummitPage().ExpensesClick();

       BrowserUtils.wait(5);
       pages.mExpensesToSummitPage().clickCreate();

       extentLogger = report.createTest("verify that Expenses Desciription Table  element visiable");

       extentLogger.info("Expense Description text is visiable");

       BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().ExpenseDesciriptionText);

       System.out.println("ExpenseDesciription text is display");

       extentLogger.info("product  text is visiable");
       BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().productText);

       extentLogger.info("unit Price text is visiable");
       /// BrowserUtils.verifyElementDisplayed(pages.mExpensesToSummitPage().UnitPrice);

       System.out.println(pages.mExpensesToSummitPage().UnitPrice.isDisplayed());

       extentLogger.info("Quantity Price text is visiable");
       System.out.println(pages.mExpensesToSummitPage().QuantityText.isDisplayed());

       extentLogger.info("Bilreference text is visiable");
       System.out.println(pages.mExpensesToSummitPage().billReferencesText);

       extentLogger.info("Expenses  date text is visiable");
       System.out.println(pages.mExpensesToSummitPage().ExpensesDateText);

       extentLogger.info("Employee  text is visiable");
       System.out.println(pages.mExpensesToSummitPage().EmployeeText);

       extentLogger.info("Sale order text is visiable");
       System.out.println(pages.mExpensesToSummitPage().SaleOrderText);

       extentLogger.info("Total  text is visiable");
       System.out.println(pages.mExpensesToSummitPage().total.getText());

       extentLogger.info("paymentBy  text is visiable");
       System.out.println(pages.mExpensesToSummitPage().paymentBy.getText());

       extentLogger.info("document  text is visiable");
       System.out.println(pages.mExpensesToSummitPage().paymentBy.getText());

   }


@Test
    public void DocumentInvalidFanctuanlity(){
    pages.mExpensesToSummitPage().ExpensesClick();

    BrowserUtils.wait(5);
    pages.mExpensesToSummitPage().clickCreate();

    //System.out.println(Driver.getDriver().getPageSource());
    pages.mExpensesToSummitPage().document.click();

    extentLogger = report.createTest("verify that document fanctionality with out filling up the table gives invalid worning");

    extentLogger.info("invalid  text is visiable");

//    System.out.println("$$$$$$$$$$$$");
//    System.out.println("$$$$$$$$$$$$");
//    System.out.println("$$$$$$$$$$$$");
//    System.out.println("$$$$$$$$$$$$");
//    System.out.println("$$$$$$$$$$$$");
//    System.out.println(Driver.getDriver().getPageSource());

    WebElement ss=driver.findElement(By.xpath("//div[@class='o_notification_manager']//div[@class='o_notification_title']"));
    //System.out.println(ss.getAttribute("value"));
    System.out.println(ss.getText());
    //System.out.println(ss.getAttribute("innerHTMl"));
    System.out.println(ss.isDisplayed());


}

@Test
public void EmployeeDropDown(){

    pages.mExpensesToSummitPage().ExpensesClick();

    BrowserUtils.wait(5);
    pages.mExpensesToSummitPage().clickCreate();

    extentLogger = report.createTest(" EmployeedraopDwn functionality");

    extentLogger.info("Employee dropdown  is cilicable");

    pages.mExpensesToSummitPage().EmployeeDropDawn.click();

}
@Test
    public void productDropDown(){

    pages.mExpensesToSummitPage().ExpensesClick();

    BrowserUtils.wait(5);
    pages.mExpensesToSummitPage().clickCreate();

    extentLogger = report.createTest("product draopDwn functionality");

    extentLogger.info("product Description text is clickable");

    pages.mExpensesToSummitPage().productDropdown.click();

}


//@Test
//    public void verifyDefaultValue(){
//
//    pages.mExpensesToSummitPage().ExpensesClick();
//
//    BrowserUtils.wait(5);
//    pages.mExpensesToSummitPage().clickCreate();
//
//    extentLogger = report.createTest("verify that default value are visiable");
//
//    extentLogger.info("unit prive default value");
//   // Assert.assertEquals(pages.mExpensesToSummitPage().UnitPrice.getText(),"$0.00");
//
//
//}
}
