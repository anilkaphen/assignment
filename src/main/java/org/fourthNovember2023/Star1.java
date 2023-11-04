package org.fourthNovember2023;

public class Star1 {
    public static void main(String args[]) {

        int i, j, star = 5;

        for (i = 0; i < star; i++) {

            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

