package topic_14_pattern_printing;

import java.util.Scanner;

public class triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars separated by a space (no trailing space)
            for (int j = 1; j <= i; j++) {
                if (j > 1) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        /*

            *
           * *
          * * *
         * * * *
        * * * * *

         */
    }
}
