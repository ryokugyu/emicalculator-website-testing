package org.example;

import org.example.utilities.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("deprecation")
public class pageBaseClass {
    public static Properties props = ReadPropertiesFile.readConfiguration();
    public  WebDriver driver;


    public void invokeWebBrowser(String browserName) throws IOException {
        try{
            if(browserName.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", props.getProperty("driver.location"));
                driver = new ChromeDriver();
            } else if(browserName.equals("firefox")){
                System.setProperty("webdriver.gecko.driver", props.getProperty("driver.location"));
                driver = new FirefoxDriver();
            } else if(browserName.equals("safari")){
                driver = new SafariDriver();
            }
        } catch (Exception e){
            System.out.println("WebBrowser not initiated successfully. Getting error: " + e.getMessage());
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }



//    @Test
//    public static void main(String[] args) throws IOException {
//        initiateWebDriver();
//        navigateToUrl("https://www.google.com");
//        quitWebDriver();
//    }




}