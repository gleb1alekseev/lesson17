package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenu {
    @Test
    public void checkValidationTextOnContextMenu(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement contextMenuElement = driver.findElement(By.id("hot-spot"));
        actions.contextClick(contextMenuElement).perform();
        Alert alert = driver.switchTo().alert();
        String actualText = alert.getText();
        String expectedText = "You selected a context menu";
        alert.accept();
        Assert.assertEquals(actualText, expectedText);
    }
}