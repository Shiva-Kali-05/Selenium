package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverChangesInBetween {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver = new EdgeDriver();

        //Can we change driver in between? yes we can change the driver in between as we are using WebDriver.


    }
}
