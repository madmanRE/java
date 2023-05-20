package dz6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Filter {
    public static Map<String, String> filterParams(){
        Map<String, String> filterParams = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите желаемый размер оперативной памяти или напишите '-1', чтобы не заполнять данное поле");
        String userAnswer0 = scanner.nextLine();
        if (!userAnswer0.equals("-1")){
            filterParams.putIfAbsent(String.valueOf("ozu"), userAnswer0);
        }

        System.out.println("Выберете цвет: поддерживает английские названия цветов: red, green, blue, white, black, silver" +
                "или напишите '-1', чтобы не заполнять данное поле");
        String userAnswer1 = scanner.nextLine();
        if (!userAnswer1.equals("-1")) {
            String color = "";
            if (userAnswer1.equalsIgnoreCase("red")) {
                color = "red";
            } else if (userAnswer1.equalsIgnoreCase("green")) {
                color = "green";
            } else if (userAnswer1.equalsIgnoreCase("blue")) {
                color = "blue";
            } else if (userAnswer1.equalsIgnoreCase("white")) {
                color = "white";
            } else if (userAnswer1.equalsIgnoreCase("black")) {
                color = "black";
            } else if (userAnswer1.equalsIgnoreCase("silver")) {
                color = "silver";
            } else {
                System.out.println("Некорректное значение цвета.");
            }

            filterParams.putIfAbsent("color", color);
        }


        System.out.println("Укажите желаемый размер жесткого диска или напишите '-1', чтобы не заполнять данное поле");
        String userAnswer2 = scanner.nextLine();
        if (!userAnswer1.equals("-2")) {
            filterParams.putIfAbsent(String.valueOf("hardware"), userAnswer2);
        }

        System.out.println("Введите допустимый тип ОС: windows, linux, macos, no os или нажмите -1, чтобы покинуть выбор ОС");
        String userAnswer4 = scanner.nextLine();
        String os = "";
        if (!userAnswer4.equals("-1")) {
            if (userAnswer4.equalsIgnoreCase("windows")) {
                os = "windows";
            } else if (userAnswer4.equalsIgnoreCase("macos")) {
                os = "macos";
            } else if (userAnswer4.equalsIgnoreCase("linux")) {
                os = "linux";
            } else if (userAnswer4.equalsIgnoreCase("no os")){
                os = "no os";
            }
            filterParams.putIfAbsent("os", os);
        }


        System.out.println("--------------------------------------------------------");
        System.out.println("Укажите минимальную стоиость товара");
        filterParams.putIfAbsent(String.valueOf("min price"), scanner.nextLine());
        System.out.println("Укажите максимальную стоимость товара");
        filterParams.putIfAbsent(String.valueOf("max price"), scanner.nextLine());

        return filterParams;
    }

    public static ArrayList<Notebook> filter(ArrayList<Notebook> base, Map<String, String> filterParams) {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Выбранные параметры фильтрации");
        for (String key : filterParams.keySet()) {
            System.out.println(key + ": " + filterParams.get(key));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");


        ArrayList<Notebook> result = new ArrayList<>();
        Boolean flag;

        for (int i = 0; i < base.size(); i++){
            flag = true;

            if(filterParams.containsKey("ozu")){
                Integer ozuSize = parseInt(filterParams.get("ozu"));
                if(parseInt(String.valueOf(base.get(i).getOzu())) >= ozuSize) {
                } else {
                    flag = false;
                    continue;
                }

            if(filterParams.containsKey("color")){
                String keyword = filterParams.get("color").toLowerCase();
                if(base.get(i).getColor().toLowerCase().equals(keyword)){
                }
                else {
                    flag = false;
                    continue;
                }
            }

            if(filterParams.containsKey("hardware")){
                Integer hardwareSize = parseInt(filterParams.get("hardware"));
                    if(parseInt(String.valueOf(base.get(i).getHardware())) >= hardwareSize) {

                    } else {
                        flag = false;
                        continue;
                    }
                }
            }


            if(filterParams.containsKey("os")){
                String keyword = filterParams.get("os").toLowerCase();
                if(base.get(i).getOs().toLowerCase().contains(keyword)){
                }
                else {
                    flag = false;
                    continue;
                }
            }


            double price = Double.parseDouble(String.valueOf(base.get(i).getPrice()));
            double minPrice = Double.parseDouble(filterParams.get("min price"));
            double maxPrice = Double.parseDouble(filterParams.get("max price"));

            if (price >= minPrice && price <= maxPrice) {
            } else {
                flag = false;
                continue;
            }


            if(flag){
                result.add(base.get(i));
            }

        }

        return result;

    }
}
