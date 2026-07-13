package topic_12_jump_statements;

import java.util.Scanner;

public class guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comp = (int)((Math.random()*100)+1);
        int user;
        int attempt = 5;
        while (true) {
            if(attempt == 0){
                System.out.println("You are out of attempts :(");
                break;
            }
            System.out.print("Guess the number between 1 and 100 :- ");
            user = sc.nextInt();
            if(user>comp) System.out.println("Too high");
            else if(user<comp) System.out.println("Too low");
            else {
                System.out.println("Congratulations!! You Won!!");
                break;
            }
            attempt--;
            System.out.println("Left out attempts :- "+attempt);
        }
    }
}
