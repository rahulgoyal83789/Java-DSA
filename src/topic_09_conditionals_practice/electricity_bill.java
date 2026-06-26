package topic_09_conditionals_practice;

import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double finalBill = 0;
        if (units <= 100) {
            finalBill = units * 4.2;
        } else if (units <= 200) {
            finalBill = (100 * 4.2) + ((units - 100) * 6);
        } else if (units <= 400) {
            finalBill = (100 * 4.2) + (100 * 6) + ((units - 200) * 8);
        } else {
            finalBill = (100 * 4.2) + (100 * 6) + (200 * 8) + ((units - 400) * 13);
        }
        double amount = 0;
        if(units>400){
            amount = (units-400)*13;
            units = 400;
        }
        if(units>200 && units<=400){
            amount += (units-200)*8;
            units = 200;
        }
        if(units>100 && units<=200){
            amount += (units-100)*6;
            units = 100;
        }
        if(units>0 && units<=100){
            amount += units*4.2;
        }

        System.out.printf("%.1f", amount);

    }
}
