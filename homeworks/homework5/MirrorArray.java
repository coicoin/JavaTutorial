package homeworks.homework5;

import java.util.Scanner;

/**
 * Реализовать программу, которая для считанного массива выводит его зеркальное представление.
 * (массив нужно предварительно развернуть, а потом уже выводить).
 */

public class MirrorArray {
    public static void main(String[] args) {
        //может произойти переполнение, рекомендуется long
        //int a[] = {3, 2, 1, 6, 1};
        Scanner scanner = new Scanner(System.in);
        int n; //длина массива
        int result = 0; //результат программы

        System.out.println("Введите длину массива: ");
        n = scanner.nextInt();
        int a[] = new int[n];

        System.out.println("Введите массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        //преобразует массив в int
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 9) {
                result = result * 100;
                result += a[i]%100;
            } else {
                result = result * 10;
                result += a[i] % 10;
            }
        }

        //разворачивает массив и добавляет его к number
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > 9) {
                result = result * 100;
                result += a[i] % 100;
            } else {
                result = result * 10;
                result += a[i] % 10;
            }
        }

        System.out.println(result);
    }
}
