package pl.probny.test.part1;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.probny.test.base.BaseTest;

public class ClassPart1One extends BaseTest {

    @Test()
    void method1Part1One() {
        System.out.println("method1_Part1_One");
        System.out.println(name);
    }

    @Test
    void method2Part1One() {
        System.out.println("method2_Part1_One");
    }

    @Test
    void method3Part1One() {
        System.out.println("method3_Part1_One");
    }

    @Test
    void method4Part1One() {
        System.out.println("method4_Part1_One");
    }

    @Test
    void method5Part1One() {
        System.out.println("method5_Part1_One");
    }

    @Test
    void method6Part1One() {
        System.out.println("method6_Part1_One");
        Assert.assertEquals(1,2);
    }
}
