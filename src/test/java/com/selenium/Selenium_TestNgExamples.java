package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_TestNgExamples {
    @Test
    public void test_selenium_appvwo()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Login - Wingify");
        driver.quit();
    }
}
