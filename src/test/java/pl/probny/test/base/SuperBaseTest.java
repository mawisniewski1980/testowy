package pl.probny.test.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pl.probny.composite.TestClassOne;
import pl.probny.composite.TestClassTwo;

public class SuperBaseTest {

    protected TestClassOne testClassOne;
    protected TestClassTwo testClassTwo;

    @BeforeSuite(alwaysRun = true)
    protected void beforeSuite() {
        System.out.println("BeforeSuite...");
        testClassOne = new TestClassOne();
        testClassTwo = new TestClassTwo();
    }


    @AfterSuite(alwaysRun = true)
    protected void afterSuite() {
        System.out.println("AfterSuite...");
    }
}
