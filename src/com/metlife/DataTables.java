package com.metlife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DataTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
        int count = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody")).findElements(By.tagName("tr")).size();
        System.out.println(count);

        for (int i=1; i<=count; i++)

            System.out.println
                    (driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+i+"]/td[2]")).getText() +
                            "\t" + driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+i+"]/td[6]")).getText());

        /*WebElement name=driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[2]"));
        WebElement salary=driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[6]"));
        System.out.println(name.getText());
        System.out.println(salary.getText());
        WebElement name2=driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td[2]"));
        WebElement salary2=driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td[6]"));
        System.out.println(name2.getText());
        System.out.println(salary2.getText());*/








    }
}
