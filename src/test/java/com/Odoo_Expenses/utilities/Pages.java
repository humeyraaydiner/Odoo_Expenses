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

<<<<<<< HEAD
    public ExpensesAnalysisPage  expensesAnalysisPage() {
            if (expensesAnalysisPage==null) {
=======
         public ExpensesAnalysisPage  expensesAnalysisPage() {
            if (expensesAnalysisPage== null) {
>>>>>>> 5c61dc764df5d7cb45d9b1a6b4f9ede5d601ef08
            expensesAnalysisPage= new ExpensesAnalysisPage();
        }
           return expensesAnalysisPage;
    }


<<<<<<< HEAD
    public MExpensesToSummitPage  mExpensesToSummitPage() {
           if (mExpensesToSummitPage==null) {
=======
          public MExpensesToSummitPage  mExpensesToSummitPage() {
           if (mExpensesToSummitPage== null) {
>>>>>>> 5c61dc764df5d7cb45d9b1a6b4f9ede5d601ef08
            mExpensesToSummitPage = new MExpensesToSummitPage();
        }
            return mExpensesToSummitPage;
    }




}
