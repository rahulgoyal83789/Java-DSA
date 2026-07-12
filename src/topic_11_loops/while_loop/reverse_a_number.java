package topic_11_loops.while_loop;

import java.util.Scanner;

public class reverse_a_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n%10;
            revNum = revNum *10 + lastDigit;
            n = n/10;
        }
        System.out.println(revNum);
    }
}
