package topic_11_loops.while_loop;

import java.util.Scanner;

public class hcf {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = Math.min(num1,num2);
        while (hcf >= 1) {
            if(num1%hcf==0 && num2%hcf==0){
                System.out.println(hcf);
                System.exit(0);
            }
            hcf--;
        }

    }
}
