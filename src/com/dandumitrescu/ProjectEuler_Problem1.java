package com.dandumitrescu;

/*      Multiples of 3 and 5

        Problem 1
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

        Find the sum of all the multiples of 3 or 5 below 1000.*/

public class ProjectEuler_Problem1 {

    public static void main(String[] args) {
        int sum_3 = 0;
        int sum_5 = 0;

        for (int i=1; i <= 1000; i++) {
            if ((i * 3) < 1000) {
                if ((i * 3) % 5 == 0) {
                    sum_3 -= (i * 3);
                }
                sum_3 += (i * 3);
            }
            if ((i * 5) < 1000) {
                sum_5 += (i*5);
            }
            System.out.println((i * 3) + " " + (i * 5) + " " + sum_3 + " " + sum_5 + "\n");
        }

        System.out.println("Sum of all the multiples of 3 or 5 below 1000 is: " + (sum_3 + sum_5));
    }
}
