package topic_11_loops.while_loop;

import java.util.Scanner;

public class strong_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = number;
        int factSum = 0;
        while(n>0){
            int lastDigit = n%10;
            int fact = 1;
            for(int i = 1; i<=lastDigit; i++){
                fact *= i;
            }
            factSum += fact;
            n /= 10;
        }
        if(factSum==number) System.out.println("Yes");
        else System.out.println("No");
    }
}
