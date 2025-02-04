package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Notification {

    @Test
    public void notificationCheckTest1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        WebElement we = driver.findElement(By.xpath("//*[@href=\"/notification_message\"]"));
        we.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement we1 = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        String expected = "Action successful";
        String actualText = we1.getText().trim().replace("\n", "").replace("\r", "");
        actualText = actualText.replace("×", "").trim();
        Assert.assertEquals(actualText, expected);
    }

    @Test
    public void notificationCheckTest2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        WebElement we = driver.findElement(By.xpath("//*[@href=\"/notification_message\"]"));
        we.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement we1 = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        String expected = "Action unsuccesful, please try again";
        String actualText = we1.getText().trim().replace("\n", "").replace("\r", "");
        actualText = actualText.replace("×", "").trim();
        Assert.assertEquals(actualText, expected);
    }
}
