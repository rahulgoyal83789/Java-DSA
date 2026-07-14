package topic_11_loops.while_loop;

import java.util.Scanner;

public class isbn_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n<1000000000){
            System.out.println("false");
            return;
        }
        long num = n;
        int digits=0;
        long sum = 0;
        while (num > 0) {
            digits++;
            sum += (digits*(num%10));
            num /=10;
        }
        System.out.println(Boolean.toString(sum % 11 == 0));
    }
}
