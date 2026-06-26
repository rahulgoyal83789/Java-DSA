package topic_09_conditionals_practice;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("leap");
        }  else {
            System.out.println("not leap");
        }
        if(year%4==0){
            if(year%100!=0) System.out.println("leap");
            else if (year%400==0)  System.out.println("leap");
            else System.out.println("not leap");
        } else {
            System.out.println("not leap");
        }


    }
}
