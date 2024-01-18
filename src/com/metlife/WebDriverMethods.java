package com.metlife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverMethods {
    public static void main(String[] args) {
       /* WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.get("http://yahoo.com");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.quit();*/

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();

        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();

        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();

        driver.findElement(By.xpath("(//*[text()='Admin'])[3]")).click();

        //driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("abmabcd");
        driver.findElement(By.xpath("//*[starts-with(@placeholder,'Type for hints...')]")).sendKeys("abmabcd");

        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();

        driver.findElement(By.xpath("//*[text()='Enabled']")).click();

        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("testuser");

        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Welcome@123");

        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Welcome@123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.navigate().refresh();

        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();

        driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();


        /*System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());*/
    }
}
