package com.selenium.Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class testSeleniumMiniProject2 {
    @Owner("Shiva")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify the error message")
    @Test
    public void test_signup_page() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wingify.com/free-trial");
        driver.manage().window().maximize();
        //Thread.sleep(4000);
        //WebElement partial_match=driver.findElement(By.partialLinkText("Start a free"));
        //partial_match.click();

        //Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
        WebElement username = driver.findElement(By.id("free-trial-step1-email"));
        username.sendKeys("admin123@admin.com");
        Thread.sleep(4000);

        WebElement checkbox= driver.findElement(By.id("free-trial-step1-gdpr-consent-checkboxcu-marketing-consent-checkbox"));
        checkbox.click();
        WebElement chekBox2 = driver.findElement(By.id("free-trial-step1-gdpr-consent-checkboxcu-gdpr-consent-checkbox"));
        chekBox2.click();

        WebElement creatButton = driver.findElement(By.tagName("button"));
        creatButton.click();

        WebElement errorMessage = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(errorMessage.getText(),"admin.com doesn't look like a business domain. Please use your business email.");






    }
}
