package topic_11_loops.for_loop;

import java.util.Scanner;

public class a_raised_to_b {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :- ");
        int a = sc.nextInt();
        System.out.print("Enter b :- ");
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println(ans);
    }
}
