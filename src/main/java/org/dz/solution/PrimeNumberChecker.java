package org.dz.solution;

public class PrimeNumberChecker {
    public boolean check(final int number) {
        int result;
        int divider = 2;
        for (int i = 1; i <= divider; i++){
            result = number / divider;
            if (number < 1) {
                System.out.print("");
            }else if (number == 2) {
                System.out.print("its a prime number!");
            }else if (number % 2 == 0) {
                System.out.print("its not a prime ");
            }
        }
        return true;
    }
}
