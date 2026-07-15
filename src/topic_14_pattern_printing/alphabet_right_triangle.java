package topic_14_pattern_printing;

import java.util.Scanner;

public class alphabet_right_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            char ch = 'A';
            for(int j = 1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
