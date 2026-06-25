package topic_06_operators;

public class pract {
    static void main(String[] args) {
        // Q-1
        int i = 5;
        System.out.print(i++); //5
        System.out.print(++i); //7
        System.out.print(i--); //7
        System.out.print(--i); //5
        //Q-2
        int a=5,b=2;
        int c = ++a + b++;
        System.out.println(c); // 8
        //Q-3
        int x=1010;
        System.out.println(x%100); // 10
        System.out.println(x/10); //101

        // Q-4
        int x4 = 3;
        System.out.println(x4--);//3
        System.out.println(x4);//2
        //Q-5
        int a5 = 2;
        int b5 = 3;
        boolean result = (a5++ < b5) && (b5++ > a5);
        System.out.println(result);
        System.out.println(a5);
        System.out.println(b5);
        //Q-6
        int a6 = 5;
        int b6 = a6++ + ++a6;
        int c6 = --a6 + a6++;

    }
}
