package homeworks.homework5;

import java.util.Scanner;

/**
 * Реализовать программу, которая для считанного массива выводит его зеркальное представление.
 * (массив нужно предварительно развернуть, а потом уже выводить).
 */

public class MirrorArray {
    public static void main(String[] args) {
        //минус программы - работает только с числами до 9
        //int a[] = {3, 2, 1, 6, 1};
        Scanner scanner = new Scanner(System.in);
        int n; //длина массива
        int inputArray = 0; //ввод в массив
        int result = 0; //результат программы

        System.out.println("Введите длину массива: ");
        n = scanner.nextInt();
        int a[] = new int[n];

        System.out.println("Введите массив: ");
        for (int i = 0; i < a.length; i++) {
            a[inputArray] = scanner.nextInt();
            inputArray++;
        }

        //преобразует массив в int
        for (int i = 0; i < a.length; i++) {
            result = result * 10;
            result += a[i]%10;
        }

        //разворачивает массив и добавляет его к number
        for (int i = a.length - 2; i >= 0; i--) {
            result = result * 10;
            result += a[i]%10;
        }

        System.out.println(result);
    }
}
