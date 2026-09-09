package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_001 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        FirefoxDriver driver1 = new FirefoxDriver();
        driver.get("https:www.google.com");
        driver.quit();

        //if you want to run your code in only single browser then use above code
        //And,in future if you want to run in multiple browser for a testing purpose then use below code

        WebDriver driver2 = new ChromeDriver();
        driver2= new ChromeDriver();
        driver2= new FirefoxDriver();
        driver2 = new EdgeDriver();




    }
}
