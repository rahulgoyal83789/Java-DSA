package topic_13_nested_loops;

import java.util.Scanner;

public class L01 {
    static void main(String[] args) {
        for(int i =1;i<=5;i++){
            System.out.println(i+"th event");
            for(int j =1;j<=3;j++){
                System.out.println("Hello world");
            }
        }
    }
}
