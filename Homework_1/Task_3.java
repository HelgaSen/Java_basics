package Homework_1;

import java.util.Scanner;
/*
*Реализовать простой калькулятор
*/
public class Task_3 {
    public static void main(String[] args) {      
        System.out.println("Введите два числа: ");
        Scanner readConsole = new Scanner(System.in);
        double firstNum;
        double secondNum;
        double result;
        char operator;
        firstNum = readConsole.nextDouble();
        secondNum = readConsole.nextDouble();
        System.out.println("Введите действие (+, -, *, /): ");
        operator = readConsole.next().charAt(0);
        readConsole.close();
        switch(operator) {
           case '+': result = firstNum + secondNum;
              break;
           case '-': result = firstNum - secondNum;
              break;
           case '*': result = firstNum * secondNum;
              break;
           case '/': result = firstNum / secondNum;
              break;
           default:  System.out.println("Что-то не так. Так калькулятор не умеет");
              return;
        }
        System.out.println("Результат вычисления:\n");
        System.out.printf(firstNum + " " + operator + " " + secondNum + " = " + result);   
    }
}
