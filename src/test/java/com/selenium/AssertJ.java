package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class AssertJ {
    @Test
    public void AssertJ_1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //AssertJ validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty().isNotNull();
        
    }
}
