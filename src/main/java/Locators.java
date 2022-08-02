import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Launching web browser...");
        System.setProperty("webdriver.chrome.driver", "/Users/sumit.kumar/Documents/Sumit/selenium_drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/");
        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='user_name']")).sendKeys("sumit kumar");
        driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("sumit@outlook.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@name='commit']")).submit();

        Thread.sleep(1000);
        driver.quit();
        System.out.println("Task End...");

    }
}
