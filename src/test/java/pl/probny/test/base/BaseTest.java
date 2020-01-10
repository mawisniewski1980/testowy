package pl.probny.test.base;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    protected void beforeSuite() {
        System.out.println("BeforeSuite...");
    }

    @BeforeTest
    protected void beforeTest() {
        System.out.println("BeforeTest...");
    }

    @BeforeClass
    protected void beforeClass() {
        System.out.println("BeforeClass...");
    }

    @BeforeMethod
    protected void beforeMethod() {
        System.out.println("BeforeMethod...");
    }

    @AfterMethod
    protected void afterMethd() {
        System.out.println("AfterMethod...");
    }

    @AfterClass
    protected void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest
    protected void afterTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    protected void afterSuite() {
        System.out.println("AfterSuite...");
    }


}
