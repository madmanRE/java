package dz4;

import java.util.ArrayList;
import java.util.Collections;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList();
        for (int i = 1; i < 30; i+=3){
            array.add(i*2);
        }
        System.out.println(array);
        System.out.println(Collections.min(array));
        System.out.println(Collections.max(array));
        System.out.println(sumAvr(array));

    }

    public static Integer sumAvr(ArrayList<Integer> array){
        Integer sum = 0;
        Integer avr = 0;
        for (int i=0; i<array.size(); i++){
            sum += array.get(1);
        }
        return sum / array.size();
    }
}
