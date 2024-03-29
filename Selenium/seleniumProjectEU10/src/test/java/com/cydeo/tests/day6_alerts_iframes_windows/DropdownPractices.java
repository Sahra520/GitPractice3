package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        /*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
*/
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void dropdown_Task5(){

        //we located the dropdown and it's ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")) );

        //3. Select Illinois
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        stateDropdown.selectByVisibleText("Illinois");


        //4. Select Virginia
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        stateDropdown.selectByValue("VA");



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //5. Select California
        stateDropdown.selectByIndex(5);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //6. Verify final selected option is California.

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);

    }
    @Test
    public void dropdown_Task6(){
        //Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using  : visible text
        yearDropdown.selectByVisibleText("1924");

        //Select month using   : value attribute
        monthDropdown.selectByValue("11");

        //Select day using : index number
        dayDropdown.selectByIndex(0);


        //creating expected values
        String expectedYear = "1924";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser + create assertions
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
//we use getText(), because we can not store web element into the String, getText() turn us web element to the String
        Assert.assertEquals(actualYear,expectedYear);

        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        Assert.assertTrue(actualMonth.equals(expectedMonth));

        String actualDay= dayDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay,expectedDay);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}

