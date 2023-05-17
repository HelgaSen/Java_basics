package Homework_3;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            arrayList.add(random.nextInt(100));
        }
        System.out.println("Рандомный список целых чисел: " + arrayList); 
        arrayList.sort(null);
        System.out.println("Отсортированный: " + arrayList);
        int min = arrayList.get(0);
        int max = arrayList.get(arrayList.size()-1);
        OptionalDouble avg = arrayList.stream().mapToInt(e -> e).average();
        double average = avg.getAsDouble();   
        System.out.printf("Минимальное число: %d%nМаксимальное число: %d%n", min, max );  
        System.out.println("Среднее арифметическое: " + average);  
    }
}
