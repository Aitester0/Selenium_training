import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class DemoNassCom {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://nasscom.in/");
        // First Click on Login and After that click on register
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("//li[text()='register']")).click();


        //3.  Enter First name as nirmal
        driver.findElement(By.id("edit-field-fname-reg-0-value")).sendKeys("nirmal");

        // 4.  Enter Last name as tester
        driver.findElement(By.id("edit-field-lname-0-value")).sendKeys("tester");

        // 5.  Enter email address as nirmal1@gmail.com
        driver.findElement(By.id("edit-mail")).sendKeys("nirmal1@gmail.com");
        // 6.  Enter company name as Apple
        driver.findElement(By.id("edit-field-company-name-registration-0-value")).sendKeys("Apple");

        // 7.  Select IT Consulting from dropdown
        Select valueType=new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
        valueType.selectByVisibleText("IT Consulting");
        // 8.  We do Not have need to automate CAPTCHA

        //9.  Now Click on Register
        driver.findElement(By.id("edit-submit--2")).click();

    }
}
