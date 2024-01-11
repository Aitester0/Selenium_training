package com.metlife.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;

public class Task2CitiBank {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.online.citibank.co.in/");
        driver.findElement(By.className("newclose")).click();
        driver.findElement(By.className("newclose2")).click();
        driver.findElement(By.xpath("//a[@title='Login']")).click();

        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//div[@class='fl cup pt3']")).click();
        ArrayList<String> window1=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window1.get(1));

        driver.findElement(By.xpath("//a[text()='select your product type']")).click();
        driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
        driver.findElement(By.id("citiCard1")).sendKeys("4545");
        driver.findElement(By.id("citiCard2")).sendKeys("5656");
        driver.findElement(By.id("citiCard3")).sendKeys("8887");
        driver.findElement(By.id("citiCard4")).sendKeys("9998");
        driver.findElement(By.id("cvvnumber")).sendKeys("123");

        driver.findElement(By.id("bill-date-long")).click();
        Select selectYear=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        selectYear.selectByVisibleText("2022");
        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        selectMonth.selectByVisibleText("Apr");

        driver.findElement(By.xpath("//a[text()='14']")).click();
        driver.findElement(By.xpath("//input[@value='PROCEED']")).click();

        String errMsg= driver.findElement(By.xpath("//div[@role='dialog']")).getText();

        System.out.println(errMsg);
    }
}
