package seminar5;

import java.util.HashMap;
import java.util.Map;

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

1)	ввод: s = "LVIII"
              вывод: 58
              разбор: L = 50, V= 5, III = 3.
2)	ввод: s = "MCMXCIV"
вывод: 1994
разбор: M = 1000, CM = 900, XC = 90 and IV = 4.


 */

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = fillMap();
        System.out.println(convert("MMMCDLXXXVIII", map));
    }

    private static Integer convert(String str, Map<Character, Integer> map) {
        Integer result = map.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                result -= map.get(str.charAt(i));
            } else {
                result += map.get(str.charAt(i));
            }
        }
        return result;
    }

    private static Map<Character, Integer> fillMap() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
