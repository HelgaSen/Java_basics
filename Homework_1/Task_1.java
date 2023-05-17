package Homework_1;

import java.util.Scanner;

/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            product *= i;
        }
        System.out.printf("%d-ое треугольное число равно %d%n", n, sum);
        System.out.printf("Факториал числа %d равен %d%n", n, product);
        number.close();
    }
}
