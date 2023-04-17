package homework2;
//Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a num");
        for (int i = 0; i < 10; i++) {
            int x = scanner.nextInt();
            if (funcSimpleNums(x)) {
                sum += x;
            }
        }
        System.out.println(sum);
    }

    public static boolean funcSimpleNums(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && i != 1 && i != x) {
                return false;
            }

        }
        return true;
    }
}
