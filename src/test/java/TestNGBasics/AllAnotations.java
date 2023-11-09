package TestNGBasics;

import org.testng.annotations.*;

public class AllAnotations {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("AfterSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
}
