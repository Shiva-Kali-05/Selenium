package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_TestNG {
    //The advantage of using Testng is, we don't have to write main method.
    //Just write a normal function,make sure the function should starts with test.
    @Test
    public void test_selenium_01()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //TestNG
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();
    }

}
