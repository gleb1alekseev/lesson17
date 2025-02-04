package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddRemoveElement {

    @Test
    public void addRemoveElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElement.click();
        addElement.click();
        WebElement deleteElement = driver.findElement(By.xpath("//button[text()='Delete']"));
        deleteElement.click();
        List<WebElement> deletedButtons = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(deletedButtons.size(), 1);
    }
}
