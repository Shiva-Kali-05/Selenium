package com.selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_miniproject {
    @Test
    public void testwebsite() throws InterruptedException {
        //Driver Managing
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Finding elements with locators
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("1234");

        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();
        Thread.sleep(5000);

        //Assertions

        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message.getText());

        //Assert.asserEquals("driver.")
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        driver.quit();

    }
}
