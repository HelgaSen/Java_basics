package Homework_4;

/*
Реализовать консольное приложение, которое:

1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
4. Если введено exit, завершаем программу
*/

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Сколько значений будет в списке? Введите число: ");
        Scanner number = new Scanner(System.in);
        Scanner readConsole = new Scanner(System.in);
        Scanner readConsoleAgain = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        Deque<String> stack = new ArrayDeque<>();
        int n = number.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент списка: ");
            list.add(i, readConsole.nextLine());
            stack.push(list.get(i));
        }

        System.out.println("Что будем делать? Введите print или revert для действия или exit для выхода:");
        String input = readConsoleAgain.nextLine();

        while (!input.equals("exit")) {

            if (input.equals("print")) {
                System.out.print("LIFO output:" + stack);
                System.out.println("\nЧто будем делать? Введите print или revert для действия или exit для выхода:");
                input = readConsoleAgain.nextLine();
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    stack.pollFirst();
                    System.out.println("Последняя введенная строка удалена из памяти.");
                    System.out.println("Что будем делать? Введите print или revert для действия или exit для выхода:");
                    input = readConsoleAgain.nextLine();
                } else {
                    System.out.println("А нечего больше удалять.");
                    input = "exit";
                }
            }
        }
        System.out.println("Выполнение программы прекращено.");
        number.close();
        readConsole.close();
        readConsoleAgain.close();
    }
}
