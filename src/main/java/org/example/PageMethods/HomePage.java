package org.example.PageMethods;

import org.example.baseTestClass;
import org.example.UIMap.HomePage_UIMap;
import org.example.utilities.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends baseTestClass {


    CommonFunctions CF = new CommonFunctions(driver);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterLoanAmount(String amount){
        try{
            CF.clearAndSendText(driver, HomePage_UIMap.Dashboard.amountInputBox, "2000000");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void enterInterestRate(String rate){
        try{

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void enterLoanTenure(String tenure){
        try{

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test1(String[] args) throws IOException {
        CF.invokeWebBrowser(props.getProperty("browserName"));

    }
}
