package com.Odoo_Expenses.utilities;

import com.Odoo_Expenses.pages.*;


public class Pages {

    private LoginPage loginPage;
    private MainPage mainPage;
    private ExpensesPage expensesPage;
    private mExpensesToSummitPage mExpensesToSummitPage;
    private ExpensesAnalysisPage expensesAnalysisPage;
    private SearchPage searchPage;

    private ExpenseReportsToApprovePage expenseReportsToApprovePage;
        private LoginPage loginPage;
        private MainPage mainPage;
        private ExpensesPage expensesPage;
        private mExpensesToSummitPage mExpensesToSummitPage;
        private ExpensesAnalysisPage expensesAnalysisPage;
        private SearchPage searchPage;
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

        }

