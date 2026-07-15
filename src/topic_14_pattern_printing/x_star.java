package topic_14_pattern_printing;

import java.util.Scanner;

public class x_star {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i==j||(i+j==n+1)) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
