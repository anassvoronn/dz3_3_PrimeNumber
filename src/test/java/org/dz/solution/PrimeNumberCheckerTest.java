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
    public void check2() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(2);
        Assert.assertTrue(result);
    }

    @Test
    public void check13() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(13);
        Assert.assertFalse(result);
    }

    @Test
    public void check3() {
        PrimeNumberChecker checker = new PrimeNumberChecker();
        boolean result = checker.check(3);
        Assert.assertTrue(result);
    }

}