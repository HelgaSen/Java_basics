package Homework_6;

import java.util.*;

public class Laptop {

    private String manufacturer;
    private int ram;
    private String operatingSystem;
    private String colour;
    private int price;

    public Laptop(String manufacturer, int ram, String operatingSystem, String colour, int price) {
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
        this.price = price;
    }

    public boolean validateObject() {
        return true;
    }

    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("manufacturer");
        list.add("ram");
        list.add("operatingSystem");
        list.add("colour");
        list.add("price");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук " + manufacturer + ". Опретивная память: " + ram + "ГБ" + ", операционная система: " + operatingSystem
                + ", Цвет: " + colour + ", цена: " + price + " USD.";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
