package dz1;
import java.util.ArrayList;

/*
Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
название которых содержит «высший»

Ответ:
Наивысшая цена товара 1го сорта = 1134.0
Наивысшая цена товара 2го сорта = 2662.0
 */



public class Main {
    static public void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("book", 12.0, 5));
        products.add(new Product("высший локть", 17.0, 1));
        products.add(new Product("book высший", 12.0, 3));
        products.add(new Product("выший маринек", 532.0, 1));
        products.add(new Product("Высший коробка рука нога", 2662.0, 2)); //
        products.add(new Product("bookвысший", 1134.0, 1)); //
        products.add(new Product("высший что-то там", 2.0, 1)); //
        products.add(new Product("высший что-то тут", 12.0, 7));
        System.out.println(products);
        System.out.println("================================");
        System.out.println("Наивысшая цена товара 1го сорта = "+getMaxPrice(products).get(0)
        +"\nНаивысшая цена товара 2го сорта= "+getMaxPrice(products).get(1));

    }

    static public ArrayList<Double> getMaxPrice(ArrayList<Product> products){
        Double maxPriceFirst = 0.0;
        Double maxPriceSecond = 0.0;

        for (int i = 0; i <= products.size()-1; i++){
            if(products.get(i).name.toLowerCase().contains("высший") && products.get(i).sortClass == 1){
                if (products.get(i).price > maxPriceFirst) maxPriceFirst = products.get(i).price;
            }if(products.get(i).name.toLowerCase().contains("высший") && products.get(i).sortClass == 2){
                if (products.get(i).price > maxPriceSecond) maxPriceSecond = products.get(i).price;
            }

        }
        ArrayList<Double> prices = new ArrayList<Double>(2);
        prices.add(maxPriceFirst);
        prices.add(maxPriceSecond);
        return prices;
    }

}
