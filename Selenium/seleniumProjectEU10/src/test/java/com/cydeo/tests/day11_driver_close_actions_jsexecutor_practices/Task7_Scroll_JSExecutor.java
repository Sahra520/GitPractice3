package com.cydeo.tests.day11_driver_close_actions_jsexecutor_practices;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task7_Scroll_JSExecutor {

    @Test
    public void task7_scroll_test(){
        //    TC #7: Scroll using JavascriptExecutor
//1- Open a Chrome browser
//2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//3- Scroll down to “Cydeo” link
        //Locating CYDEO link to be able to pass in the actions method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

//4- Scroll up to “Home” link
        //Locating "Home" link to be able to pass in the actions method
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink, homeLink);


       // js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink, homeLink, someOtherLink);

        //objects
        //cydeoLink [0]
        //homeLink [1]
        //someOtherLink[2]


//5- Use below provided JS method only
//   JavaScript method to use : arguments[0].scrollIntoView(true)
//   Note: You need to locate the links as web elements and pass them as arguments into executeScript() method

        Driver.closeDriver();

    }





}
