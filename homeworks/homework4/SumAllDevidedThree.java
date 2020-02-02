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
        int[] arr = new int[5];

        //ввод данных в массив
        System.out.println("Заполните массив: ");
        int num = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

        //вывод всего массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
