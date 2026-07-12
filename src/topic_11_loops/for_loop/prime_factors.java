package topic_11_loops.for_loop;

import java.util.Scanner;

public class prime_factors {
    public static String primeFactors(int n) {
        if (n == 0 || n == 1) return "No prime factors";
        StringBuilder result = new StringBuilder();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                result.append(i).append(" ");
                n /= i;
            }
        }
        if (n > 1) {
            result.append(n);
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primeFactors(n));
    }
}