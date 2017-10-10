package TestSuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import MyCode.TestngTestClass;

public class Tests {
    @Test
    public static void WEB1() {
        Assert.assertFalse(TestngTestClass.printString("FIVE"), "Bad frfrfr");
    }

    @Test
    public static void WEB2() {
        TestngTestClass.printString("it IS a TesT");
    }

    @Test
    public static void WEB3() {
        TestngTestClass.printString("!@XXX#");
    }

    @Test
    public static void WEB4() {
        TestngTestClass.printString("5");
    }

    @Test
    public static void WEB5() {
        TestngTestClass.printString("test");
    }

    @Test
    public static void WEB6() {
       TestngTestClass.printString("5*11=12");
    }

}
/*
Positive:
    FIVE : True
    it IS a TesT : True
    !@XXX# : True

Netative
    5 : False
    test : False
    5*11=12 : False
 */