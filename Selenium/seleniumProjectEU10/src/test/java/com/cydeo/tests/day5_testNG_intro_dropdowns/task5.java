package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task5 {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }


    @Test
    public void dropdownPractice() throws InterruptedException {

        Select year_dropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));

        //dateDropdown.selectedByVisibleText("2020")
        year_dropdown.selectByVisibleText("2020");

        Thread.sleep(3000);

        //dateDropdown.selectedByValue("2021")
        year_dropdown.selectByValue("2021");

        Thread.sleep(3000);

        //dateDropdown.selectedByIndex(2) //in option indexes starts from zero
        year_dropdown.selectByIndex(3);//2020

        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
