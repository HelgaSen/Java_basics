package Homework_6;

import java.util.*;

public class Laptop_App {
   public static void main(String[] args) {

      Set<Laptop> laptops = new HashSet<>();
      laptops.add(new Laptop("Alianware", 32, "Windows", "silver", 3500));
      laptops.add(new Laptop("Asus",64, "Windows","black", 3000));
      laptops.add(new Laptop("MSI", 64, "Windows","silver", 2990));
      laptops.add(new Laptop("Lenovo", 32, "Windows", "silver", 1890));
      laptops.add(new Laptop("MSI", 32, "Linux", "pink",2200));
      laptops.add(new Laptop("Acer", 8, "Windows", "black", 1100));
      laptops.add(new Laptop("HP", 16, "Linux", "blue", 990));
      laptops.add(new Laptop("HP", 8, "Windows", "silver", 1000));
      laptops.add(new Laptop("Apple", 8, "macOS", "golg", 1500));
      laptops.add(new Laptop("Apple", 8, "macOS", "white", 1500));
      
      Selection operation = new Selection(laptops);
      operation.start();
   }
}