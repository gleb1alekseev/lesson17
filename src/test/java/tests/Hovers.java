package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class Hovers {

    @Test
    public void hoverCheckTest1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("(//*[@id=\"content\"]//img)[1]"));
        action.moveToElement(we).perform();
        action.moveToElement(driver.findElement(By.xpath("(//*[@id=\"content\"]//a)[1]")))
                .click().perform();
        String expectedUrl1 = "https://the-internet.herokuapp.com/users/1";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl1);
    }

    @Test
    public void hoverCheckTest2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("(//*[@id=\"content\"]//img)[2]"));
        action.moveToElement(we).perform();
        action.moveToElement(driver.findElement(By.xpath("(//*[@id=\"content\"]//a)[2]")))
                .click().perform();
        String expectedUrl2 = "https://the-internet.herokuapp.com/users/2";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl2);
    }

    @Test
    public void hoverCheckTest3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("(//*[@id=\"content\"]//img)[3]"));
        action.moveToElement(we).perform();
        action.moveToElement(driver.findElement(By.xpath("(//*[@id=\"content\"]//a)[3]")))
                .click().perform();
        String expectedUrl3 = "https://the-internet.herokuapp.com/users/3";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl3);
    }
}
