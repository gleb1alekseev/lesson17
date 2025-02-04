package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {

    @Test
    public void dropdownCheckTest1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));
        dropdown1.click();
        Select select = new Select(dropdown1);
        select.selectByVisibleText("Option 1");
        if (!dropdown1.isSelected()){
            dropdown1.click();
        }
        Assert.assertEquals("Option 1", select.getFirstSelectedOption().getText());
    }

    @Test
    public void dropdownCheckTest2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdown2 = driver.findElement(By.id("dropdown"));
        dropdown2.click();
        Select select = new Select(dropdown2);
        select.selectByVisibleText("Option 2");
        if (!dropdown2.isSelected()){
            dropdown2.click();
        }
        Assert.assertEquals("Option 2", select.getFirstSelectedOption().getText());
    }
}

