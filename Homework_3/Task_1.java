package Homework_3;

import java.util.Arrays;

/*Реализовать алгоритм сортировки слиянием */
public class Task_1 {
    public static void main(String[] args) {
        int[] array = {11, -48, 136, 0, 38, 35, 2, 55, 87, -56};
        int[] sortedArray = mergeSort(array);
        System.out.println("Дан массив: " + Arrays.toString(array));
        System.out.println("Массив, отсортированный методом слияния: " + Arrays.toString(sortedArray));
    }
    public static int[] mergeSort(int[] arr) {
        int[] tmp1 = Arrays.copyOf(arr, arr.length);
        int[] tmp2 = new int[arr.length];
        int[] result = mergeSortInner(tmp1, tmp2, 0, arr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] tmp1, int[] tmp2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return tmp1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(tmp1, tmp2, startIndex, middle);
        int[] sorted2 = mergeSortInner(tmp1, tmp2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == tmp1 ? tmp2 : tmp1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
