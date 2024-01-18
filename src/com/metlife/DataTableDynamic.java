package com.metlife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class DataTableDynamic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_grid");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://google.com");
        Set<String> winids = driver.getWindowHandles();
        driver.switchTo().window(winids.toArray()[0].toString());

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        List<WebElement> cells = driver.findElements(By.xpath("//div[@class='grid-item']"));
        System.out.println(cells.size());
        //int row = cells.size()/3;
        for (int i=0; i<cells.size();i=i+3){
            System.out.println(cells.get(i).getText()+"\t"+cells.get(i+2).getText());
        }
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
