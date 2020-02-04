package homeworks.homework4;

import java.util.Scanner;

/**
 * Реализовать программу, которая для последовательности чисел, оканчивающихся -1,
 * выводит сумму чисел, произведение цифр которых делится на 3.
 * Разрешено использовать массивы
 */

public class SumAllDevidedThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mult = 0; //произведение цифр числа
        int res = 0; //итоговая сумма чисел, произведение цифр которых делится на 3

        //длина массива
        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];

        //ввод данных в массив
        System.out.println("Заполните массив числами не более 99: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //вывод всего массива
        System.out.println("Введенный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //вывод массива после произведения цифр в числе
        System.out.println("\nМассив после цикла произведения цифр в числе: ");
        for (int i = 0; i < arr.length; i++) {
            //проверка если число больше 10 или если число содержит 0
            if (arr[i] > 10) {
                mult = arr[i]%10 * (arr[i]/10);
            } else if (arr[i]%10 == 0) {
                mult = 0;
            } else {
                mult = arr[i];
            }
            System.out.print(mult + " ");
            //проверка деления на 3 и копирование в новый массив
            if (mult%3 == 0 && mult != 0) {
                newArr[i] = arr[i];
            }
        }

        //итого, сумма отобранных чисел
        System.out.println("\nМассив чисел, произведение цифр которых делится на 3: ");
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 0) {
                continue;
            } else {
                System.out.print(newArr[i] + " ");
                res += newArr[i];
            }
        }
        System.out.println("\nИтоговая сумма чисел произведение цифр которых делится на 3: " + res);
    }
}
