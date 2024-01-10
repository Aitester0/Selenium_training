import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo4SalesForce
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.id("signup_link")).click();

        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserEmail")).sendKeys("John@cccs.com");

        Select title=new Select(driver.findElement(By.name("UserTitle")));
        title.selectByVisibleText("IT Manager");

        Select emp=new Select(driver.findElement(By.name("CompanyEmployees")));
        emp.selectByVisibleText("101 - 200 employees");

        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
        driver.quit();
    }
}
