package dz5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1) Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */

public class Main{
    public static void main(String[] args) {
        String s = "Россия идет вперед всей планеты. Планета — это не Россия.";
        s = s.replaceAll("\\p{Punct}", "");
        String[] sArray = s.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое слово");
        String input = scanner.nextLine().toLowerCase();
        System.out.println(findMatches(sArray, input));

    }

    public static Integer findMatches(String[] sArr, String input) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : sArr) {
            if(item.equalsIgnoreCase(input)) {
                map.putIfAbsent(item.toLowerCase(), 0);
                map.put(item.toLowerCase(), map.get(item.toLowerCase()) + 1);
            }
        }
        return map.get(input);
    }

}