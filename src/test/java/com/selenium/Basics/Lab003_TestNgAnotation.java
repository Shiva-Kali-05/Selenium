package com.selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Lab003_TestNgAnotation {
    @Test
    public void test_selenium_01()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //By using testng we can verify our test case using assertions
        //Assert is a class
        // Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        //Assertj validation
        assertThat(driver.getTitle())
                .isNotBlank()
                .isNotEmpty()
                .isNotNull()
                .isEqualTo("Google"); //3 assertion in one go

        driver.quit();

    }
}
