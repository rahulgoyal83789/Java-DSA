package topic_14_pattern_printing;

import java.util.Scanner;

public class inverted_right_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*

        * * * * *
        * * * *
        * * *
        * *
        *

         */
    }
}
