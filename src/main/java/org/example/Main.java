package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static Properties props = new Properties();
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {
        loadPropertyFileData();
        System.out.println(props.getProperty("driver.location"));
    }

    public static void loadPropertyFileData() throws IOException {
        FileReader reader = new FileReader("src/main/resources/Application.properties");
        props.load(reader);
    }

    public void initiateWebDriver(){
        System.setProperty("webdriver.chrome.driver", props.getProperty("driver.location"));
        driver.manage().window().maximize();
    }

    public void quitWebDriver(){
        driver.close();
    }

    public void navigateToUrl(String url){
        driver.switchTo().defaultContent();
        driver.get(url);
    }
}