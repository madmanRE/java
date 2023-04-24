package seminar4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i, i);
        }
        System.out.println("Исходный массив: " + list);
        String res = "";
        for (int i = 0; i < list.size(); i++) {
            res += list.remove(list.size() - 1)+"->";
            i--;
        }
        if(res.length() > 1) {
            System.out.println("Результат разворота: " + res.substring(0, res.length() - 2));
        } else System.out.println(res);

    }
}
