package homework2;

import java.util.Scanner;

//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a num");
        int x = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            int y = scanner.nextInt();
            if (x >= y) {
                System.out.println("False: последоватльность не возрастающая");
                break;
            }
            x=y;
        }
        System.out.println("True: последовательность возрастающая");
    }
}
