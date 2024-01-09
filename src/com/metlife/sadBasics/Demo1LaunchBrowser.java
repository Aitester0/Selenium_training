package com.metlife.sadBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String actualResult = driver.getTitle();
        System.out.println(actualResult);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);

        driver.close();
    }
}
