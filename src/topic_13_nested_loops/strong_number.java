package topic_13_nested_loops;

import java.util.Scanner;

public class strong_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum = 0, num =n;
        while(n>0){
            int digit = n%10;
            int fact = 1;
            for(int i=1;i<=digit;i++){
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        System.out.println((num==sum)?"Strong number":"Not Strong number");
    }
}
