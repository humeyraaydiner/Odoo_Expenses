package com.Odoo_Expenses.tests;

import com.Odoo_Expenses.pages.LoginPage;
import com.Odoo_Expenses.utilities.Pages;
import com.Odoo_Expenses.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class logIn extends TestBase {

  @Test
  public void logInTest(){

      extentLogger = report.createTest("Login Test.");
      extentLogger.info("Sign in");
      pages.login().signIn();
      WebDriverWait wait = new WebDriverWait(driver, 10);
      extentLogger.info("Click on 'Expenses'. ");
      wait.until(ExpectedConditions.elementToBeClickable(pages.main().ExpensesButton)).click();
      //fail();
      extentLogger.pass("Login Test Passed...");

  }
}
