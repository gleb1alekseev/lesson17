package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDateTables {

    @Test
    public void sotableDateTables1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement t1 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]"));
        String expected1 = "Smith";
        Assert.assertEquals(t1.getText(), expected1);
    }

    @Test
    public void sotableDateTables2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement t2 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]"));
        String expected2 = "fbach@yahoo.com";
        Assert.assertEquals(t2.getText(), expected2);
    }

    @Test
    public void sotableDateTables3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement t3 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[5]"));
        String expected3 = "http://www.timconway.com";
        Assert.assertEquals(t3.getText(), expected3);
    }
}
