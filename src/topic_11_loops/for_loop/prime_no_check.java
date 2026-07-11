package topic_11_loops.for_loop;

import java.util.Scanner;

public class prime_no_check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :- ");
        int n = sc.nextInt();
//        if(n<=1){
//            System.out.println("Neither prime nor composite");
//            return;
//        }
//        for(int i = 2; i*i<=n; i++){
//            if(n%i==0){
//                System.out.println("Not prime");
//                return;
//            }
//        }
//        System.out.println("prime");
        boolean isPrime = true;
        if(n<=1) isPrime = false;
        else if(n==2) isPrime = true;
        else if(n%2==0) isPrime = false;
        else{
            for(int i = 3; i*i<=n;i+=2){
                if(n%i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime " : "Not Prime ");
    }
}
