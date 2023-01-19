package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //Do Browser driver setup
        //open browser
     driver = WebDriverFactory.getDriver("chrome");

        //maximize the page
        driver.manage().window().maximize();

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


    @Test
    public void selenium_test(){

        //get "https:google.com"
        driver.get("https:google.com");

        //Assert: title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not matching here");
        //Assert.assertEquals(driver.getTitle(),"Google");

    }
}
