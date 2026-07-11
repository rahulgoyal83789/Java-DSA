package topic_11_loops.for_loop;
import java.util.Scanner;
public class sum_of_factors {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :- ");
        int n = sc.nextInt();
        int factSum = n;
        for(int i = 1; i<=n/2; i++){
            if(n%i==0) factSum+=i;
        }
        System.out.println("sum of Factors of " + n + " is " + factSum);
    }
}
