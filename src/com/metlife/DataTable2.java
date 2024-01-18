package com.metlife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DataTable2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
        List<WebElement> rows = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody")).findElements(By.tagName("tr"));
        for (WebElement row: rows){
            List<WebElement> cols = row.findElements(By.tagName("td"));
            System.out.println(cols.get(1).getText()+"\t"+cols.get(2).getText()+"\t"+cols.get(3).getText()+"\t"+cols.get(4).getText()+"\t"+cols.get(5).getText());
        }
    }
}
