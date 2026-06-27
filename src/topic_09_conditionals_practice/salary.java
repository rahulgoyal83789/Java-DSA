package topic_09_conditionals_practice;

import java.util.Scanner;

public class salary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        int year = sc.nextInt();
        char qualification = sc.next().charAt(0);
        int salary = 0;
        if(qualification == 'P'){
            if(year>=10){
                if (gender == 'M') salary = 15000;
                else if (gender == 'F') salary = 12000;
            } else salary = 10000;
        } else if (qualification == 'U') {
            if(year>=10){
                if (gender == 'M') salary = 10000;
                else if (gender == 'F') salary = 9000;
            } else{
                if (gender == 'M') salary = 7000;
                else if (gender == 'F') salary = 6000;
            }
        }
        System.out.println(salary);
    }
}
