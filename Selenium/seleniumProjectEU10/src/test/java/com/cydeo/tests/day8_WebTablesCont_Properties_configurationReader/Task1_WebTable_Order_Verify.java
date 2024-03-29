package com.cydeo.tests.day8_WebTablesCont_Properties_configurationReader;
import com.cydeo.tests.utilities.WebDriverFactory;
import com.cydeo.tests.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class Task1_WebTable_Order_Verify {
    /*
    TC #1: Web table practice
 1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected.
Expected: 12/31/2021
     */
    WebDriver driver;
    //    TC #1: Web table practice
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_test(){

//2. Verify Bob’s name is listed as expected.
        //Locate the cell that has Bob Martin text in it.
        WebElement bobMartinCell =
            driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());
//Expected: “Bob Martin”
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();
        Assert.assertEquals(actualBobName,expectedBobName);


//3. Verify Bob Martin’s order date is as expected.
        WebElement bobMartinDateCell =
        driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
//Expected: 12/31/2021
        String expectedBobDate = "12/31/2021";
        String actualBobDate = bobMartinDateCell.getText();

        Assert.assertEquals(actualBobDate,expectedBobDate);

    }







    @Test
    public void test2(){
        String costumerOrderDate1 = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);

        String costumerOrderDate2 = WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println("costumerOrderDate2 = " + costumerOrderDate2);
    }








//using WebTableUtils.orderVerify(); method
    @Test
    public void test3(){
        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");
    }




}
