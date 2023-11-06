package org.fourthNovember2023;

public class Pattern2 {
    public static void main(String args[]) {

        int i, j, k, star = 5;

        for (i = 0; i <= star - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= star - 1 - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}