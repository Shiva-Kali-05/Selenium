package com.selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands_003 {
    public static void main(String[] args) throws InterruptedException {
        //Open the URL - https://opensource-demo.orangehrmlive.com?utm_source=chatgpt.com
        //verify wether the tile OrangeHRM is available

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com?utm_source=chatgpt.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();

    }
}
