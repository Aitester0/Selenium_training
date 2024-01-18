package com.metlife.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Practice1Program {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
        ArrayList<String> window=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window.get(0));

        driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
        ArrayList<String> window2=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window2.get(1));

        driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
        ArrayList<String> window3=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window3.get(2));
    }
}
