package homework2;

import java.util.Arrays;

//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[] {10, 3, -2, 41, 9, -7, -12, 10, 9, 0, -8, 301};
        int sumIndexesOfDoubleElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (Integer.toString(array[i]).replace("-","").length() == 2) {
                sumIndexesOfDoubleElements += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                array[i] = sumIndexesOfDoubleElements;
            }
        }
        System.out.println(sumIndexesOfDoubleElements);
        System.out.printf(Arrays.toString(array));
    }
}
