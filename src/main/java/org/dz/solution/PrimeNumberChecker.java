package org.dz.solution;

public class PrimeNumberChecker {
    public boolean check(final int number) {
        if (number == 1){
            return false;
        }
        for (int i = 2; i <= 100; i++) {
            if (number % i == 0) {
               return false;
            }else {
                return true;
            }
        }
        return true;
    }
}
