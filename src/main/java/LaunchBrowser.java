import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.out.println("Launching web browser...");
        System.setProperty("webdriver.chrome.driver", "/Users/sumit.kumar/Documents/Sumit/selenium_drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        String getURL = driver.getCurrentUrl();
        System.out.println(getURL);
    }
}
