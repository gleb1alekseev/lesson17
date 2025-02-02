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
        String actual1 = "Smith";
        Assert.assertEquals(actual1, t1.getText());
    }

    @Test
    public void sotableDateTables2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement t2 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]"));
        String actual2 = "fbach@yahoo.com";
        Assert.assertEquals(actual2, t2.getText());
    }

    @Test
    public void sotableDateTables3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");

        WebElement t3 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[5]"));
        String actual3 = "http://www.timconway.com";
        Assert.assertEquals(actual3, t3.getText());
    }
}
