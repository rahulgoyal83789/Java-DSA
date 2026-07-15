package topic_14_pattern_printing;

import java.util.Scanner;

public class v_star {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
/*
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i==j) System.out.print("* ");
                else System.out.print("  ");
            }
            for(int j = n+1; j < 2*n; j++){
                if(i+j==2*n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
*/

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < 2*n; j++){
                if(i==j||i+j==2*n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
