package org.twenty092023;

public class FindPrimeNumber {
    public static void main(String args[]) {
        FindPrimeNumber obj = new FindPrimeNumber();
        obj.findPrimeNumberForGivenRange(2, 11);
    }

    public void findPrimeNumberForGivenRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.println("Given number is prime: "+ i);
            }
        }
    }

    public boolean isPrimeNumber(int number) {
        int c = 0;
        for (int j = 2; j <= number/2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
