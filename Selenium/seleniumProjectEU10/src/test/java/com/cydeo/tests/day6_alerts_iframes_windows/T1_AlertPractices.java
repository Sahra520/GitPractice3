package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class T1_AlertPractices {

        WebDriver driver;

        @BeforeClass
    public void setupMethod(){
            driver = WebDriverFactory.getDriver("Chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.get("https://practice.cydeo.com/javascript_alerts");
        }

//    TC #1: Information alert practice
//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//3. Click to “Click for JS Alert” button
//4. Click to OK button from the alert
//5. Verify “You successfully clicked an alert” text is displayed.

    @Test
        public void Task1() throws InterruptedException {
        WebElement Information_Alert_Button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        Information_Alert_Button.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("resultText.isDisplayed() = " + resultText.isDisplayed());

        //or

        //Failure message will only be displayed if assertion fails:"Result text is NOT displayed"
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");

        //or

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();
        Assert.assertEquals(expectedText,actualText,"Actual result test is NOT as expected!!!");


    }


   /*
TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.
*/
    @Test
    public void Task2(){
        WebElement hello_confirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        hello_confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement Ok_Text = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("Ok_Text.isDisplayed() = " + Ok_Text.isDisplayed());

    }


    /*
TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.
  */
    @Test
    public void Test3(){
        WebElement promptButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        WebElement helloText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(helloText.isDisplayed(),"\"Hello\" text is NOT displayed");

    }
    @AfterClass
    public void teardownMethod(){
        driver.close();
    }


}
