package dz2;

public class Product {
    String name;
    String country;
    Double weight;
    Double price;
    Integer sortQuality;

    public Product(String name, String country, Double weight, Double price, Integer sortQuality) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.sortQuality = sortQuality;
    }


    public Product(){

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sortQuality=" + sortQuality +
                '}';
    }


}

