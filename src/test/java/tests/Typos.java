package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Typos {

    @Test
    public void typos() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement p = driver.findElement(By.xpath("//p[2]"));
        String actual = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(actual, p.getText());
    }
}
