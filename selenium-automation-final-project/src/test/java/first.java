import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class first {

        @Test
        public void openSwagLabs() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.quit();
    }
}
