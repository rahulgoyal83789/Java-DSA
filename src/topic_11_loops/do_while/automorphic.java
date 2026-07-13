package topic_11_loops.do_while;

import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read n from scanner
        int n = sc.nextInt();
        int dupN = n;

        // square of number
        int sq = n*n;
        int countOfDigit = 0;

        //counting the digits of n
        while (n>0){
            countOfDigit++;
            n/=10;
        }
        //checking that given number is automorphic number of not
        if (dupN == sq%Math.pow(10,countOfDigit)){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
