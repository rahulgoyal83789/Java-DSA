package topic_12_jump_statements;

import java.util.Scanner;

public class L01 {
    static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            if(i==3) continue; // skip current iteration
            System.out.println(i);
            if(i==6) break; // will end this loop
        }
        // switch
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid input");
            }
        }
        switch (n){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }
        String ans = switch (n){
            case 1 -> {
                yield "Monday";
            }
            case 2 ->{
                yield "Tuesday";
            }
            case 3 ->{
                yield "Wednesday";
            }
            case 4 ->{
                yield "Thursday";
            }
            case 5 ->{
                yield "Friday";
            }
            case 6 ->{
                yield "Saturday";
            }
            case 7 ->{
                yield "Sunday";
            }
            default ->{
                yield "Invalid input";
            }
        };
        System.out.println(ans);
    }
}
