package topic_11_loops.while_loop;

import java.util.Scanner;

public class L01 {
    public static void main(String[] args) {
//        int i =1;
//        while(i<=5){
//
//            i++;
//        }
//        adding digits of a number separately
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int lastdigit = n%10;
            sum += lastdigit;
            n = n/10;
        }
        System.out.println(sum);
        // printing digits of a number by left separately
        int number = Math.abs(sc.nextInt());
        if(number == 0){
            System.out.println(0);
        }else{
            int temp = number;
            int divisor = 1;
            while(temp/10>0){
                divisor = divisor*10;
                temp = temp/10;
            }
            while(divisor>0){
                System.out.println(number/divisor);
                number = number % divisor;
                divisor = divisor/10;
            }
        }

    }
}
