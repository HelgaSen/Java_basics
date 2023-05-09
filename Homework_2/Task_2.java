package Homework_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл. */
public class Task_2 {
    private static File log;
    private static FileWriter fileWriter;
    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int[] array = {461, 38, -15, 14, 21, 0, 105, -7, 8};
            bubbleSort(array);
            System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
            writeLog(Arrays.toString(arr));
        }
    }    

    public static void writeLog(String note) {
        
        try(FileWriter writer = new FileWriter("log.txt"))
        {
           fileWriter.write(note + "\n"); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
