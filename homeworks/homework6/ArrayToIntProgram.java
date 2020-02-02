package homeworks.homework6;

/**
 * Для массива вида int a[] = {3, 2, 1, 6, 1} сохранить в переменную number число 32161.
 */

public class ArrayToIntProgram {
    public static void main(String[] args) {
        int a[] = {3, 2, 1, 6, 1};
        int number = 0;

        for (int i = 0; i < a.length; i++) {
            number = number * 10;
            number += a[i]%10;
        }

        System.out.println(number);
    }
}
