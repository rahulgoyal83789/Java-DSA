package topic_09_conditionals_practice;

import java.util.Scanner;

public class final_amount_after_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialAmount =  sc.nextInt();
        int discount;
        if(initialAmount<0){
            System.out.println("Amount can't be less than 0.");
        } else {
            if (initialAmount <= 5000) {
                discount = 0;
            } else if (initialAmount <= 7000) {
                discount = 5;
            } else if (initialAmount <= 9000) {
                discount = 10;
            } else {
                discount = 20;
            }

            int finalAmount = initialAmount - (initialAmount * discount / 100);
            System.out.println(finalAmount);
        }
    }
}
