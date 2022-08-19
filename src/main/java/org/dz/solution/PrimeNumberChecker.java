package org.dz.solution;

public class PrimeNumberChecker {
    public boolean check(final int number) {
        if (number == 1) {
            return false;
        }
        int n = (number / 2) + 1;
        for (int i = 2; i < n; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
