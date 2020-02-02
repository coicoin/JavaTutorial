package homeworks.homework2;

import java.util.Scanner;

/**
 * Написать программу, которая сохраняет в переменную reversed зеркальное представление числа 32123
 * Разрешено использовать условия, циклы, чтение с консоли
 */

public class MirrorNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, reversed = 0;

        System.out.println("Введите число для зеркалирования ");
        num = scanner.nextInt();
        reversed = num;
        num = num / 10;
        while (num > 0) {
            reversed = reversed * 10;
            reversed = reversed + num % 10;
            num = num / 10;
            System.out.println(num%10);
        }
        System.out.print(reversed);
    }
}