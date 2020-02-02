package homeworks.homework3;

import java.util.Scanner;

/**
 * Реализовать программу, которая выводит сумму цифр введенного числа.
 */

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, result; //для калькулятора
        String anyNumber = null; //для суммы множества чисел

        //сумма множества чисел. Реализация с int
        System.out.println("1. Способ суммирования цифр определенного числа через остаток от деления: ");
        System.out.println("Введите любое целочисленное число");
        int sumInt = 0;
        int numberInt = scanner.nextInt();
        while (numberInt != 0) {
            sumInt += numberInt%10;
            numberInt = numberInt / 10;
        }
        System.out.println(sumInt);

        //сумма множества чисел. Считывает String, преобразует в int.
        System.out.println("2. Способ суммирования цифр определенного числа с помощью String и charAt: ");
        System.out.println("Введите любое целое число");
        anyNumber = scanner.next();
        int sumFromChar = 0;

        if (anyNumber != null) {
            for (int i = 0; i < anyNumber.length(); i++) {
                sumFromChar += Integer.parseInt(String.valueOf(anyNumber.charAt(i)));
            }
        }
        System.out.println("Сумма цифр числа " + anyNumber + " равна " + sumFromChar);

        //Сумма 2 цифр с клавиатуры
        System.out.println("3. Способ рассчета суммы 2 чисел:");
        System.out.println("Введите число a");
        a = scanner.nextDouble();

        System.out.println("Введите число b");
        b = scanner.nextDouble();

        result = a + b;

        System.out.println("Сумма цифр " + a + " и " + b + " = " + result);

    }
}