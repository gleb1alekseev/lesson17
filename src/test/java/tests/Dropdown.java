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
    public void dropdown1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));
        element.click();

        Select dropdown = new Select(element);

        dropdown.getOptions();

        dropdown.selectByVisibleText("Option 1");

        if (!element.isSelected()){
            element.click();
        }

        Assert.assertEquals("Option 1", dropdown.getFirstSelectedOption().getText());
    }

    @Test
    public void dropdown2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));
        element.click();

        Select dropdown = new Select(element);

//        dropdown.getOptions();

        dropdown.selectByVisibleText("Option 2");

        if (!element.isSelected()){
            element.click();
        }

        Assert.assertEquals("Option 2", dropdown.getFirstSelectedOption().getText());
    }
}

