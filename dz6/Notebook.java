package dz6;
import java.io.Serializable;

import java.io.Serializable;

public class Notebook implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private Double price;
    private Integer ozu;
    private String color;
    private String os;
    private Integer hardware;

    public Notebook(String title, Double price, Integer ozu, String color, String os, Integer hardware) {
        this.title = title;
        this.price = price;
        this.ozu = ozu;
        this.color = color;
        this.os = os;
        this.hardware = hardware;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getOzu() {
        return ozu;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }

    public Integer getHardware() {
        return hardware;
    }

    @Override
    public String toString() {
        return this.title+" "+ this.price+ "p. \n"+"Характеристики:\n"+" Оперативная память: "+this.ozu+"\n Цвет: "+this.color+
                "\n Операционная система: "+this.os+"\n Жесткий диск: "+this.hardware+"\n";
    }
}


