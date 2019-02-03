package com.Odoo_Expenses.utilities;

import com.Odoo_Expenses.pages.*;


public class Pages {

        private LoginPage loginPage;
        private MainPage mainPage;
        private ExpensesPage expensesPage;
        private MExpensesToSummitPage  mExpensesToSummitPage;
        private ExpensesAnalysisPage expensesAnalysisPage;


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
             if (expensesPage== null) {
            expensesPage = new ExpensesPage();
        }

           return expensesPage;
    }

    public ExpensesAnalysisPage  expensesAnalysisPage() {
            if (expensesAnalysisPage==null) {
            expensesAnalysisPage= new ExpensesAnalysisPage();
        }
        return expensesAnalysisPage;
    }


    public MExpensesToSummitPage  mExpensesToSummitPage() {
           if (mExpensesToSummitPage==null) {
            mExpensesToSummitPage = new MExpensesToSummitPage();
        }
            return mExpensesToSummitPage;
    }




}
