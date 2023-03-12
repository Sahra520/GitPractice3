package com.cydeo.tests.day11_driver_close_actions_jsexecutor_practices;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Task4_5_ActionsPractices {

    @Test
    public void task4_and_5_test(){
        //Tc4 : Scroll Practice
        //1-Open a Chrome browser
        //2-Go to: https://practice.cydeo.com
        Driver.getDriver().get("https://practice.cydeo.com");

        //3-Scroll down to "Powered by CYDEO"
        //Create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        //Locating CYDEO link to be able to pass in the actions method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //4-Scroll using Actions class "moveTo(element)" method
        actions.moveToElement(cydeoLink).pause(2000).perform();


        //Tc5 : Scroll Practice
        //1-Continue from where the Task4 is left in the same test.
        //2-Scroll back up to "Home" link using PageUp button.
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        actions.moveToElement(homeLink).pause(2000).perform();

        //actions.sendKeys(Keys.PAGE_UP).perform();

        //actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
        Driver.closeDriver();
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Driver.closeDriver();
    }



    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Driver.closeDriver();
    }



    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Driver.closeDriver();
    }


    @Test
    public void test5(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Driver.closeDriver();
    }
}
