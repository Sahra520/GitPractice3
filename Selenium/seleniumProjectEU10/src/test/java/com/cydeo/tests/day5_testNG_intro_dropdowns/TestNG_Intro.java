package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @BeforeClass
    public void setupMethod(){
        System.out.println("-->BeforeClass is running!");
        System.out.println("");
    }



    @AfterClass
    public void tearDownClass(){
        System.out.println("-->AfterClass is running!");

    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("-->BeforeMethod is running!..");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("-->AfterMethod is running!..");
        System.out.println("");
    }

    @Test
public void test1(){
        System.out.println("Test 1 is running....");

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";
        //String expected = "orange";
        Assert.assertEquals(actual, expected);
    }


    @Test   //(priority = 1)
        public void test2(){
        System.out.println("Test 2 is running....");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected),"Your message will go here");
        }



}
