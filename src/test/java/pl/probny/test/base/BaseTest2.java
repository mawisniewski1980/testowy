package pl.probny.test.base;

import org.testng.annotations.*;

public class BaseTest2 extends SuperBaseTest {

    protected String name;

    @BeforeTest(alwaysRun = true)
    protected void beforeTest() {
        System.out.println("BeforeTest...");
    }

    @BeforeClass(alwaysRun = true)
    protected void beforeClass() {
        System.out.println("BeforeClass...");
        name = testClassTwo.getName();
    }

    @BeforeMethod(alwaysRun = true)
    protected void beforeMethod() {
        System.out.println("BeforeMethod...");
    }

    @AfterMethod(alwaysRun = true)
    protected void afterMethd() {
        System.out.println("AfterMethod...");
    }

    @AfterClass(alwaysRun = true)
    protected void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest(alwaysRun = true)
    protected void afterTest() {
        System.out.println("AfterTest");
    }


}
