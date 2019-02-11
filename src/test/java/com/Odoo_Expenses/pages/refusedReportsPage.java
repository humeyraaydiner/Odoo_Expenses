package com.Odoo_Expenses.pages;


import com.Odoo_Expenses.utilities.BrowserUtils;
import com.Odoo_Expenses.utilities.ConfigurationReader;
import com.Odoo_Expenses.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class refusedReportsPage {

    public refusedReportsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-menu='388']//span")
    public WebElement expensesTab;

    @FindBy(xpath = "//a[@data-action-id='545']")
    public WebElement refusedReportTab;

    @FindBy(xpath = "//li[.='My Refused Reports']")
    public WebElement text;

    @FindBy(xpath = "//*[@accesskey = 'k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//*[@aria-label='graph']")
    public WebElement graphButton;

    @FindBy(xpath = "//*[@aria-label='pivot']")
    public WebElement pivotButton;

    @FindBy(xpath = "//strong[contains(.,'No data to display')]")
    private WebElement displayMsg;

    @FindBy(xpath = "//strong[contains(.,'No data to display.')]")
    private WebElement displayMsg2;

    @FindBy(xpath = "//*[@class='oe_view_nocontent']")
    private WebElement displayMsg3;

    @FindBy(xpath = "//p[contains(text(),'No data available for this chart. Try to add some records, or make sure that there is no active filter in the search bar.')]")
    private WebElement displayMsg4;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']/span")
    public WebElement measuresButton;

    @FindBy(xpath = "//*[@class='btn btn-default fa fa-pie-chart o_graph_button']")
    public WebElement pieChart;

    @FindBy(xpath = "//*[@data-mode='line']")
    public WebElement lineChart;

    @FindBy(xpath = "//*[@data-mode='bar']")
    public WebElement barChart;

    @FindBy(xpath = "//*[@data-original-title='Flip axis']")
    public WebElement flipAxis;

    @FindBy(xpath = "//*[@data-original-title='Expand all']")
    public WebElement expandAll;

    @FindBy(xpath = "//*[@data-original-title='Download xls']")
    public WebElement downloadXls;




    public void clickExpensesTab() {
        BrowserUtils.waitForClickablility(expensesTab, 5);
        expensesTab.click();
    }

    public void clickRefusedReportTab() {
        BrowserUtils.waitForClickablility(refusedReportTab, 5);
        refusedReportTab.click();
    }

    public void clickGraphButton() {
        BrowserUtils.waitForClickablility(graphButton, 5);
        graphButton.click();
    }

    public void clickPivotButton() {
        BrowserUtils.waitForClickablility(pivotButton, 5);
        pivotButton.click();
    }

    public void clickKanbanButton() {
        BrowserUtils.waitForClickablility(kanbanButton, 5);
        kanbanButton.click();
    }

    public String getDisplayMsg() {
        BrowserUtils.waitForVisibility(displayMsg, 5);
        return displayMsg.getText();
    }

    public String getDisplayMsg2() {
        BrowserUtils.waitForVisibility(displayMsg2, 5);
        return displayMsg2.getText();
    }

    public String getDisplayMsg3() {
        BrowserUtils.waitForVisibility(displayMsg3, 5);
        return displayMsg3.getText();
    }

    public String getDisplayMsg4() {
        BrowserUtils.waitForVisibility(displayMsg4, 5);
        return displayMsg4.getText();
    }
    public void clickMeasuresButton() {
        BrowserUtils.waitForClickablility(measuresButton, 5);
        measuresButton.click();
    }
    public void clickPieChart(){
        BrowserUtils.waitForClickablility(pieChart, 5);
        pieChart.click();
    }
    public void clickLineChart() {
        BrowserUtils.waitForClickablility(lineChart, 5);
        lineChart.click();
    }
    public void clickBarChart() {
        BrowserUtils.waitForClickablility(barChart, 5);
        barChart.click();
    }
        public void clickFlipAxis(){
        BrowserUtils.waitForClickablility(flipAxis,5);
        flipAxis.click();
    }
    public void clickExpandAll(){
        BrowserUtils.waitForClickablility(expandAll, 5);
        expandAll.click();
       }
    public void clickDownloadXls(){
        BrowserUtils.waitForClickablility(downloadXls, 5);
        downloadXls.click();
    }
    }




