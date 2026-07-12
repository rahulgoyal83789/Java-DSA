package topic_11_loops.while_loop;

import java.util.Scanner;

public class palindrome_check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        int revNum = 0;
        int n = num;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        if (revNum == num) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
