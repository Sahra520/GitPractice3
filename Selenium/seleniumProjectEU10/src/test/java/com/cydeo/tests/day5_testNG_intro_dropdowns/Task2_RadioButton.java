package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2_RadioButton {

    public static void main(String[] args) {

       // TC #2: Radiobutton handling
       // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
/*
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }  */

        // 3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadioButton.click();

       // 4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyRadioButton.isSelected()){
            System.out.println("Button is selected. Verification PASSED!");
        }else{
            System.out.println("Button is not selected. Verification FAILED!");
        }
    }
}
/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEB ELEMENT LOCATORS
 */