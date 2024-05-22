package org.example.UIMap;

import org.openqa.selenium.By;

public class HomePage_UIMap {

    public static class Dashboard {
        public static final By loanAmountLbl = By.xpath("//label[text()='Home Loan Amount']");
        public static final By interestRateLbl = By.xpath("//label[text()='Interest Rate']");
        public static final By loanTenureLbl = By.xpath("//label[text()='Loan Tenure']");

        public static final By amountInputBox = By.xpath("//input[@id='loanamount']");
        public static final By interestInputBox = By.xpath("//input[@id='loaninterest']");
        public static final By loanTenureInputBox = By.xpath("//input[@id='loanterm']");
    }
}
