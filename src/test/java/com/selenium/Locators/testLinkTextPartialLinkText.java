package com.selenium.Locators;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testLinkTextPartialLinkText {
    @Description("Create account navigate TC")
    @Test
    public void test_loginVWO()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://app.vwo.com");
        driver.manage().window().maximize();
        //WebElement a = driver.findElement(By.linkText("Start a free trial"));
        //a.click();
        WebElement partialLink= driver.findElement(By.partialLinkText("Start a"));
        partialLink.click();
        driver.quit();
    }
}
