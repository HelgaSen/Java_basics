package Homework_3;

import java.util.Arrays;

/*Пусть дан произвольный список целых чисел, удалить из него чётные числа */
public class Task_2 {
    public static void main(String[] args) {
        int[] array = {4, 3 ,8, 7, 5, 113, -13, 107, 32, 11, -48, 136, 0, 38, 35, 2, 55, 87, -56};
        System.out.println("Произвольный список целых чисел: " + Arrays.toString(array));
        int[] oddOnlyArray = Arrays.stream(array).filter(i -> i%2 != 0).toArray();
        System.out.println("Удалили все чётные: " + Arrays.toString(oddOnlyArray));
    } 
}
