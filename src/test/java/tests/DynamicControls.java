package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class DynamicControls {
    @Test
    public void checkAllDynamicControls(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"checkbox\"]")));
        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id=\"checkbox\"]"));
        WebElement input = driver.findElement(By.xpath("//input"));
        WebElement enableButton = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
        enableButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(input));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(checkboxes.isEmpty());
        softAssert.assertTrue(input.isDisplayed());
        softAssert.assertTrue(input.isEnabled());
        driver.quit();
    }
}
