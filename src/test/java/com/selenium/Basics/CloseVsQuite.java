package com.selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuite {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(5000);
        driver.close();//it will close only current window
        driver.quit(); //it will close all the open window's, all the browsers


    }
}
