package org.fourthNovember2023;

public class Star1 {
    public int StarRightTriangle(int n)
    {
        int a, b;

        for (a = 0; a < n; a++) {

            for (b = 0; b <= a; b++) {

                System.out.print("* ");
            }

            System.out.println();
        }
        return n;
    }

    public static void   main(String args[])
    {
        Star1 star1 = new Star1();
        int k = 5;
      star1.StarRightTriangle(k);

    }

}

