package com.selenium.Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonProject {
    private static final Logger log = LoggerFactory.getLogger(KatalonProject.class);

    @Owner("Shiva")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify the error message")
    @Test
    public void test_KatalonSignIn() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://katalon-demo-cura.herokuapp.com/");

            driver.findElement(By.linkText("Make Appointment")).click();
            driver.findElement(By.id("txt-username")).sendKeys("John Doe");
            driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
            driver.findElement(By.id("btn-login")).click();
            //driver.quit();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("appointment"));

            Assert.assertTrue(
                    driver.getCurrentUrl().contains("appointment"),
                    "User should navigate to the appointment page"
            );

        }
        finally {
            driver.quit();
        }
    }

    @Test
    @Description("Verify invalid credentials")
    public void invalidCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.findElement(By.linkText("Make Appointment")).click();
            driver.findElement(By.id("txt-username")).sendKeys("SK");
            ;
            driver.findElement(By.id("txt-password")).sendKeys("ThisIsAPassword");
            driver.findElement(By.id("btn-login")).click();

            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.text-danger")));

            Assert.assertEquals(errorMessage.getText(), "Login failed! Please ensure the username and password are valid.");

        }
        finally {
            driver.quit();
        }

    }

}
