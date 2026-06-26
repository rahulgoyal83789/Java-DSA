package topic_09_conditionals_practice;

import java.util.Scanner;

public class odd_even {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
