package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperMethods {
    public static WebElement waitForVisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),
                Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("timeout"))));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void click(By locator) {
        waitForVisibility(locator).click();
    }

    public static void sendKeys(By locator, String text) {
        waitForVisibility(locator).sendKeys(text);
    }

    public static String getText(By locator) {
        return waitForVisibility(locator).getText();
    }

    public static boolean isDisplayed(By locator) {
        try {
            return waitForVisibility(locator).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static void takeScreenshot(String testName) {
        // Implementation for taking screenshots
    }
}