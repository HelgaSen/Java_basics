package Homework_3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

/*Пусть дан произвольный список целых чисел, удалить из него чётные числа */
public class Task_2 {
    public static void main(String[] args) {
        /*Первый вариант */
        int[] array = {4, 3 ,8, 7, 5, 113, -13, 107, 32, 11, -48, 136, 0, 38, 35, 2, 55, 87, -56};
        System.out.println("Произвольный список целых чисел: " + Arrays.toString(array));
        int[] oddOnlyArray = Arrays.stream(array).filter(i -> i%2 != 0).toArray();
        System.out.println("Удалили все чётные: " + Arrays.toString(oddOnlyArray));

       /*Второй вариант */
        System.out.println(" "); 
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            arrayList.add(random.nextInt(100));
        }
        System.out.println("Рандомный список целых чисел: " + arrayList); 
        arrayList.removeIf(value -> value %2 == 0);
        System.out.println("Удалили все чётные: " + arrayList); 
    } 
}
