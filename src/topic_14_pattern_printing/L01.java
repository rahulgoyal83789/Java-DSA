package topic_14_pattern_printing;

import java.util.Scanner;

public class L01 {
    static void main(String[] args) {
        // Pattern Printing
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // it controls number of rows
            for (int j = 1; j <= n; j++) { // it controls number of columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
