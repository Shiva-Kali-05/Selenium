package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class SearchContext_002 {
    //public static void main(String[] args) {
        //SearchContext - it is an interface & it does not have anything
        public interface SearchContext
        {
            List<WebElement> findElements(By by);
            WebElement findElement(By by);


        }
        //SearchContext driver = new SearchContext(); not possible

        //WebDriver - WebDriver is also an interface
        //WebDriver extends from SearchContext
        //WebDriver has also some incomplete methods

    //RemoteWebDriver - it is a class & it will get everything from webdriver
    //RemoteWebdriver implements webdriver
    //We have ChromeDriver, FirefoxDriver



    }

