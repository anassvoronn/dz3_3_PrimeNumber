package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberCheckerTest {

    @Test
    public void check1() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(1);
        Assert.assertFalse(result);
    }

    @Test
    public void check181() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(181);
        Assert.assertTrue(result);
    }

    @Test
    public void check182() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(182);
        Assert.assertFalse(result);
    }

    @Test
    public void check21() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(21);
        Assert.assertFalse(result);
    }

    @Test
    public void check2() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(2);
        Assert.assertTrue(result);
    }

    @Test
    public void check13() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(13);
        Assert.assertTrue(result);
    }

    @Test
    public void check3() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(3);
        Assert.assertTrue(result);
    }

    @Test
    public void check4() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(4);
        Assert.assertFalse(result);
    }

    @Test
    public void check84() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(84);
        Assert.assertFalse(result);
    }

    @Test
    public void check97() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(97);
        Assert.assertTrue(result);
    }

}