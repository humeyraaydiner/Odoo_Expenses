package com.Odoo_Expenses.utilities;

import com.Odoo_Expenses.pages.*;
import com.Odoo_Expenses.pages.Humeyra.EmployeeInfoPage;
import com.Odoo_Expenses.pages.Humeyra.ExpenseReportPage;
import com.Odoo_Expenses.pages.Humeyra.ExpenseReportSummaryPage;


public class
Pages {


        private LoginPage loginPage;
        private MainPage mainPage;
        private ExpensesPage expensesPage;
        private mExpensesToSummitPage mExpensesToSummitPage;
        private ExpensesAnalysisPage expensesAnalysisPage;
        private SearchPage searchPage;
        private ExpenseReportPage expenseReportPage;
        private EmployeeInfoPage employeeInfoPage;
        private ExpenseReportSummaryPage expenseReportSummaryPage;
private ExpenseReportsToApprovePage expenseReportsToApprovePage;

        private refusedReportsPage refusedReport;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public MainPage main() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public ExpensesPage expensesPage() {
        if (expensesPage == null) {
            expensesPage = new ExpensesPage();
        }

           return expensesPage;
    }

    public ExpensesAnalysisPage  expensesAnalysisPage() {
        if (expensesAnalysisPage == null) {
            expensesAnalysisPage = new ExpensesAnalysisPage();
        }
        return expensesAnalysisPage;
    }

            public mExpensesToSummitPage mExpensesToSummitPage () {
                if (mExpensesToSummitPage == null) {
                    mExpensesToSummitPage = new mExpensesToSummitPage();
                }
                return mExpensesToSummitPage;
            }

            public SearchPage searchPage(){
                if (searchPage == null) {
                    searchPage = new SearchPage();
                }
                return searchPage;

            }



    public ExpenseReportPage expenseReportPage ( ) {
            if(expenseReportPage ==null){
                expenseReportPage = new ExpenseReportPage ();
            }
            return expenseReportPage;
    }
    public EmployeeInfoPage employeeInfoPage(){
            if(employeeInfoPage ==null){
                employeeInfoPage = new EmployeeInfoPage ();
            }
            return employeeInfoPage;
    }
    public ExpenseReportSummaryPage expenseReportSummaryPage(){
        if(expenseReportSummaryPage ==null){
            expenseReportSummaryPage = new ExpenseReportSummaryPage ();
        }
        return expenseReportSummaryPage;
    }


   public ExpenseReportsToApprovePage expenseReportsToApprovePage(){
        if (expenseReportsToApprovePage ==null){
            expenseReportsToApprovePage =new ExpenseReportsToApprovePage();


        }
        return expenseReportsToApprovePage;

   }
    public refusedReportsPage refusedReport(){
        if(refusedReport==null){
            refusedReport= new refusedReportsPage();
        }
        return refusedReport;
    }
}

