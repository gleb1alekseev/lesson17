package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {

    @Test
    public void checkbox1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0);
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        Assert.assertEquals(checkbox1.isSelected(), true);
    }

    @Test
    public void checkbox2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1);
        if (checkbox2.isSelected()){
            checkbox2.click();
        }
        Assert.assertEquals(checkbox2.isSelected(), false);
    }
}


