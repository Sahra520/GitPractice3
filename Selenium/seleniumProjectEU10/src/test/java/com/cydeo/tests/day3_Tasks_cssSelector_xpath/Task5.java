package com.cydeo.tests.day3_Tasks_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Task5 {

    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2- Go to: http://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("http://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:

        //4- Click to `Reset password` button
        //5- Verify “error” label is as expected.
        //Expected: Login or E-mail not found


        /*

TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a Chrome browser
2- Go to: http://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected.
Expected: Login or E-mail not found




PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
         */
    }
}
