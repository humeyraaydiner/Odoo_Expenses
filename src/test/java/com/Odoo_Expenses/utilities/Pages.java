package com.Odoo_Expenses.utilities;

import com.Odoo_Expenses.pages.LoginPage;

public class Pages {
    public class Pages {
        private LoginPage loginPage;
        private MainPage mainPage;
        private ExpensesPage expensesPage;

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


}
