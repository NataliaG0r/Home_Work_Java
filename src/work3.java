import java.util.Scanner;

public class work3 {

    int a;
    int b;
    char c;


    public work3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число а");
        a = in.nextInt();
        System.out.println("Введите число b");
        b = in.nextInt();
        System.out.println("Выберите операцию '+' '-' '/' '*'");
        c =in.next().charAt(0);
        in.close();
    }


    public static void run(int a, int b, char c ) {
        if (c == '+') {
            System.out.println(a + b);
        } else if (c == '-') {
            System.out.println(a - b);

        } else if (c == '*') {
            System.out.println(a * b);


        } else if (c == '/') {
            System.out.println(a / b);

        }
    }
}
