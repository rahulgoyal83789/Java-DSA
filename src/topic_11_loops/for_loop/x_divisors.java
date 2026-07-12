package topic_11_loops.for_loop;

import java.util.Scanner;

public class x_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int x =  sc.nextInt();
        int divisorNum = 0;
        for(int i = 1; i<=n; i++){
            int count = 0;
            for(int j = 1; j*j<=i;j++){
                if(i%j==0){
                    if(j*j!=i) count+=2;
                    else count++;
                }
            }
            if(count == x){
                divisorNum++;
            }
        }
        System.out.println(divisorNum);
    }
}
