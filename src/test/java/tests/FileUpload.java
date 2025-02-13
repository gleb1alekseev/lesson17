package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FileUpload {
    @Test
    public void uploadFileToSite(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        String filePath = "D:\\Photo\\test.jpg";
        WebElement selectFileButton = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
        selectFileButton.sendKeys(filePath);
        WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"file-submit\"]"));
        uploadButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/h3")));
        Assert.assertEquals(uploadMessage.getText(), "File Uploaded!");
    }
}
