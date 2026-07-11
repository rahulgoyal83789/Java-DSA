package topic_11_loops.for_loop;

import java.util.Scanner;

public class practice_questions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :- ");
        int n = sc.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
            sum += i;
            fact *= i;
        }
        System.out.println();
        System.out.println("Sum of 1 to "+n+" is "+sum);
        System.out.println(n+"! = "+fact);
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        // sum of even and odd numbers upto n separately
        System.out.print("Enter m :- ");
        int m = sc.nextInt();
        int evenSum = 0 , oddSum = 0;
        for (int i = 1; i<=m/2; i++){
            if(m%i==0) System.out.print(i+" ");
        }
        System.out.println(m);
        for (int i = 1; i <= m; i++) {
            if(i%2==0) evenSum += i;
            else oddSum += i;
        }
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}
