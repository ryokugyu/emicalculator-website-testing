package org.example.utilities;

import org.example.baseTestClass;
import org.example.pageBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class CommonFunctions extends baseTestClass {
    public CommonFunctions(WebDriver driver) {
        super(driver);
    }


    public void quitWebDriver(){
        driver.close();
    }

    public void navigateToUrl(String url){
        driver.manage().window().maximize();
        driver.get(url);

    }

    public void clearAndSendText(WebDriver driver, By oLocator, String text){
        driver.findElement(oLocator).clear();
        driver.findElement(oLocator).sendKeys(text);
    }
}
