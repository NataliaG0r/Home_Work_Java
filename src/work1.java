//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class work1 {
    int n;


    public work1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n");
        n = in.nextInt();
        in.close();
    }

    public void sum(int n) {
        int res1 = 0;
        int res2 = 1;
        for (int i = 1; i <= n; i++) {
            res1 +=i;
            res2 *=i;
        }

        System.out.println("Cумма чисел от 1 до n: " + res1);
        System.out.println("Произведение чисел от 1 до n: " + res2);

    }
}
