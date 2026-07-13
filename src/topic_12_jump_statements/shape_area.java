package topic_12_jump_statements;

import java.util.Scanner;

public class shape_area {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        double area;
        switch (shape) {
            case "circle"->{
                int radius = sc.nextInt();
                area = Math.PI * Math.pow(radius, 2);
                System.out.println(area);
            }
            case "triangle"->{
                int base = sc.nextInt();
                int height = sc.nextInt();
                area = base * height * 0.5;
                System.out.println(area);
            }
            case "rectangle"->{
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                area = length * breadth;
                System.out.println(area);
            }
            default -> System.out.println("Invalid shape");
        }
    }
}
