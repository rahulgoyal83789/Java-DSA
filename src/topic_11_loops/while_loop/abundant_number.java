package topic_11_loops.while_loop;

import java.util.Scanner;

public class abundant_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while(i<=n/2){
            if(n%i==0) sum +=i;
            i++;
        }

        System.out.println((sum>n)?"Yes":"No");
    }
}
