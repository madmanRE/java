import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*

 Разворот массива строк

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String sentence = in.nextLine().replaceAll("\s+", " ").trim();
        String delimiter = " ";
        String[] words = new String[0];
        words = sentence.split(delimiter);
        String[] results = new String[words.length];
        for (int i = words.length - 1; i >= 0; i--) {
                results[(words.length - 1) - i] = words[i];
        }
        String newRes = String.join(" ", results);
        System.out.println(newRes);
    }
}
*/

/*

Задача 2 с вводом чисел

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[1000];
        for (int i = 0; i<nums.length; i++) {
            int x = in.nextInt();
            if (x==0){
                break;
            }
            else nums[i] = x;
        }
        System.out.println(count(nums));
    }
    public static int count(int[] array) {
        int count = 0;
        for (int i = 0; i<array.length-1; i++) {
            if (array[i]==0){
                break;
            }
            if(array[i] > 0 && array[i+1] < 0){
                count += array[i];
            }
        }
        return count;
    }
}

*/


/*

import com.sun.jdi.Value;
//import jdk.incubator.concurrent.ScopedValue;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.*;
*/


/*

Треугольные числа

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number  = scanner.nextInt();
        System.out.println(function(number));
    }
    public static int function(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }
}
*/

/*

Простые числа

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 1001; i++) {
            if (simpleTest(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean simpleTest(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i != 1 && i != number) {
                return false;
            }
        }
        return true;
    }
}
 */


 /*

Калькулятор

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two numbers and a symbol to run a math operation");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.next();
        System.out.println(func(a, b, c));
    }

    public static Integer func(int a, int b, String c) {
        switch (c) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
            default -> {
                System.out.println("Wrong operation");
                return null;
            }
        }

    }
}

*/


/*

Сложное уравление с вопросами

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int c = scanner.nextInt();
        var result = func(a, b, c);
        if (Arrays.stream(result).max().orElse(-1) == -1) {
            String message = "Нет решений";
            System.out.println(message);
        } else {
            int number1 = result[0];
            int number2 = result[1];
            int number3 = result[2];
            System.out.println("Result:\nnumber1: " + number1 + "\nnumber2: " + number2 + "\nnumber3: " + number3);
        }
    }

    public static int[] func(String a, String b, Integer c) {
        int[] array = new int[]{-1, -1, -1};
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <=9; j++) {
                if (c - (parseInt(a.replace("?", String.valueOf(i))) + parseInt(b.replace("?", String.valueOf(j)))) == 0) {
                    array[0] = parseInt(a.replace("?", String.valueOf(i)));
                    array[1] = parseInt(b.replace("?", String.valueOf(j)));
                    array[2] = c;
                    return array;
                }
            }
        }
        return array;
    }
}

 */

