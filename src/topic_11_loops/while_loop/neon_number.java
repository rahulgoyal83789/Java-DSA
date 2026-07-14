package topic_11_loops.while_loop;

import java.util.Scanner;

public class neon_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n_sq = n*n;
        int sum =0;
        while(n_sq>0){
            sum += n_sq%10;
            n_sq /= 10;
        }
        System.out.println((sum==n)?"Yes":"No");
    }
}
