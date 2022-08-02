import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartDemo {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        System.out.println("Launching web browser...");
        System.setProperty("webdriver.chrome.driver", "/Users/sumit.kumar/Documents/Sumit/selenium_drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Alert Message handling
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();
        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);
        // Accepting alert
        alert.accept();
    }

}
