package topic_06_operators;

public class L01 {
    static void main(String[] args) {
        System.out.println(8/3);
        int a = 9;
        int b = a++;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int x = 5;
        int y = 10;
        int z = 7;
        int u = x++ + --y * z++ - y++ + --z ;
        System.out.println(u);
        int a1 = 10;
        int b1 = 8;
        int c1 = a1++ + ++b1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        // error statements
        boolean flag = true;
        //flag++; // error dega not applicable in java
        // java me boolean sirf true / false hota h --> 0/1 nhi hota
//        int a = ++10;
        int a3 = 10;
//        int b3 = ++(++a);
        System.out.println(1<8);
        System.out.println(1==8);
        System.out.println(10>9 && 7<8);
        byte by = 5;
        by += 5; // it automatically converts 5 into byte
//        by = by + 5; // it will give error because 5 is int and by is byte
        // in java all numbers are int by default
    }
}
