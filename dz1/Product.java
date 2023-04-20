package dz1;

public class Product{
    String name;
    Double price;
    Integer sortClass;

    public Product(String name, Double price, Integer sortClass){
        this.name = name;
        this.price = price;
        this.sortClass = sortClass;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sortClass=" + sortClass +
                '}';
    }
}
