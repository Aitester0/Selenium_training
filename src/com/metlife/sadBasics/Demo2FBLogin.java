package com.metlife.sadBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo2FBLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//        driver.findElement(By.id("email")).sendKeys("anonymous@gmail.com");
//        driver.findElement(By.name("pass")).sendKeys("123123");
//        Thread.sleep(3000);
//        driver.findElement(By.name("login")).click();
//        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
        System.out.println("****");
//        driver.close();

//        Thread.sleep(6000);


        driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[1]")).sendKeys("alpha");
//        driver.findElement(By.name("firstname")).sendKeys("alpha");
        driver.findElement(By.name("lastname")).sendKeys("Omega");
        driver.findElement(By.id("password_step_input")).sendKeys("00000");
        driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
        WebElement day = driver.findElement(By.name("birthday_day"));
        Select s1 = new Select(day);
        s1.selectByVisibleText("15");
        Select s2 = new Select(driver.findElement(By.id("year")));
        s2.selectByVisibleText("1994");
    }
}
