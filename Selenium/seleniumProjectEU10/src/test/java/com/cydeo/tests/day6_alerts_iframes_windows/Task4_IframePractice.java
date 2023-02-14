package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_IframePractice {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_Test(){

        //We need to switch drivers focus to iframe
        //option-1: switching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //option-2: switching to iframe using index number, here we have just one iframe and index number is starting from zero
        //driver.switchTo().frame(0);//correct

        //option3: locate as web element and pass in frame() method
        //driver.switchTo().frame(driver.findElement(By.xpath("iframe[@id='mce_0_ifr']")));

        //locate the <p> tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));//because we have just 1 p tag

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //verify: “An iFrame containing the TinyMCE WYSIWYG Editor”
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed(),"Header text is NOT displayed");
    }

    @AfterClass
    public void teardownMethod(){
        driver.close();
    }

    /*
    TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make setups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
     */




}
