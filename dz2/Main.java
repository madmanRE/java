package dz2;
import java.util.ArrayList;
import java.util.Scanner;


/*
Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */


public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList();
        products.add(new Product("book", "RU", 1.0, 544.0, 1));
        products.add(new Product("table", "EN", 11.0, 1544.0, 2));
        products.add(new Product("ball", "FR", 5.0, 44.0, 3));
        products.add(new Product("computer", "US", 6.0, 344.0, 1));
        products.add(new Product("soap", "RU", 2.0, 744.0, 2));
        products.add(new Product("toys", "UA", 1.5, 548.0, 3));
        products.add(new Product("glasses", "US", 2.4, 5144.0, 1));
        products.add(new Product("guitars", "FR", 4.2, 2544.0, 3));
        products.add(new Product("mixers", "BL", 1.2, 5446.0, 3));
        products.add(new Product("ring", "PR", 10.0, 4.0, 4));
        products.add(new Product("cards", "EN", 123.0, 344.0, 1));
        products.add(new Product("boots", "EN", 10.0, 344.0, 1));
        products.add(new Product("ti-shorts", "EN", 1000.0, 8.0, 2));
        products.add(new Product("games", "RU", 1000.0, 448.0, 4));
        System.out.println(searchForLowPrice(products));

    }

    public static ArrayList<String> searchForLowPrice(ArrayList<Product> products){
        Double lowPrice = 999999999.9;
        System.out.println("Input a sort you are looking for:");
        Scanner scanner = new Scanner(System.in);
        Integer searchSort = scanner.nextInt();
        ArrayList<String> results = new ArrayList<String>();

        for(int i = 0; i<products.size(); i++){
            if (products.get(i).price < lowPrice && products.get(i).sortQuality.equals(searchSort)) lowPrice = products.get(i).price;
        }

        for (int i = 0; i<products.size(); i++){
            if (products.get(i).sortQuality.equals(searchSort)){
                if (products.get(i).price <= lowPrice) {
                    results.add(products.get(i).name);
                }
            }
        }
        return results;

    }
}
