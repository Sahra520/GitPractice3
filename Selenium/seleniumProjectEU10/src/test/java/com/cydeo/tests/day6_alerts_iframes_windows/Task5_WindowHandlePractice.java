package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task5_WindowHandlePractice {

    WebDriver driver;

    @BeforeClass
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_Test() {
        //storing the main pages window handle as string is good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

//        4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title before click: " + actualTitle);

//        5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


//        6. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
        //window handle 1 - main window;
        //window handle 2 - 2nd window
        for (String each: allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

//        7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);

        System.out.println("Title after click: " + actualTitle);

        //if we want to go back to main page, we can use already stored main handle
        //driver.switchTo().window(mainHandle);

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    /*
   TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make setups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
     */
    }
