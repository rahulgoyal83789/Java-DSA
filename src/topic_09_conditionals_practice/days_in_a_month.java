package topic_09_conditionals_practice;

import java.util.Scanner;

public class days_in_a_month {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if(month == 2){
            System.out.println("30 days");
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else{
            System.out.println("We only have 12 months :)");
        }
    }
}
