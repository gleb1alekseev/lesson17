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
    public void hover1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        action.moveToElement(we).perform();
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")))
                .click().perform();

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/users/1");
    }

    @Test
    public void hover2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        action.moveToElement(we).perform();
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/a")))
                .click().perform();

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/users/2");
    }

    @Test
    public void hover3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        action.moveToElement(we).perform();
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/a")))
                .click().perform();

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/users/3");
    }
}
