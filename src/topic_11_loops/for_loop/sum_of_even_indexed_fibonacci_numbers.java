package topic_11_loops.for_loop;

import java.util.Scanner;

public class sum_of_even_indexed_fibonacci_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        int sum = 0;
        for(int i=1;i<=2*n;i++){
            sum += a;
            int next=a+b;
            a = b;
            b = next;
        }
        System.out.println(sum);
    }
}
