package com.herokuapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTestJS extends BaseTest {
    @BeforeTest
    public void BeforeTest() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }

    @Test
    public void testJSConfirmYesJS() {

        WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'JS Confirm')]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("return document.getElementsByTagName('button')[1].click()", confirmButton);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String actualResult = getResult();
        Assert.assertEquals(actualResult, "You clicked: Ok");

    }

    @Test
    public void testJSConfirmNo() {

        WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'JS Confirm')]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("return document.getElementsByTagName('button')[1].click()", confirmButton);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        String actualResult = getResult();
        Assert.assertEquals(actualResult, "You clicked: Cancel");
    }

    private String getResult() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        return javascriptExecutor.executeScript("return document.getElementById('result').textContent").toString();
    }
}
