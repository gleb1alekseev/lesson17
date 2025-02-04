package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDateTables {

    @Test
    public void sortDateTableTest1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        WebElement valueTable1 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]"));
        String expected1 = "Smith";
        Assert.assertEquals(valueTable1.getText(), expected1);
    }

    @Test
    public void sortDateTableTest2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        WebElement valueTable2 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]"));
        String emailValue = "fbach@yahoo.com";
        Assert.assertEquals(valueTable2.getText(), emailValue);
    }

    @Test
    public void sortDateTableTest3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        WebElement valueTable3 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[5]"));
        String siteValue = "http://www.timconway.com";
        Assert.assertEquals(valueTable3.getText(), siteValue);
    }
}
