package topic_11_loops.while_loop;

import java.util.Scanner;

public class automorphic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :- ");
        int n = sc.nextInt();
        int n_square = n*n;
        // divisor for n
        int temp = n;
        int divisor = 1;
        while(temp>0){
            divisor *=10;
            temp /=10;
        }
        int last_digits = n_square % divisor;
        if(last_digits==n){
            System.out.println(n+" is an Automorphic number");
        }else{
            System.out.println(n+" is not an Automorphic number");
        }
    }
}
