package homeworks.homework1;

/**
 * Написать программу, которая переводит число 234 в двоичную систему счисления.
 */

public class DenaryToBinaryConverter {
    public static void main(String[] args) {
        //способ 1
        int denary = 234;

        System.out.println("Дано число " + denary);
        System.out.println("1. Способ перевода через встроенный метод");
        System.out.println(Integer.toBinaryString(denary));

        //способ 2
        String binary = "";

        System.out.println("\n2. Способ перевода через остаток от деления и стринг");
        while (denary > 0) {
            binary += denary%2;
            denary = denary/2;
        }
        for (int i = binary.length() - 1; i >= 0; i--) {
            System.out.print(binary.charAt(i));
        }
        System.out.println();

        //способ 3
        System.out.println("\n3. Решение как пример");
        System.out.println("" + 1 + 3%2 + 7%2 + 14%2 + 29%2 + 58%2 + 117%2 + 234%2);

        //способ 4
        System.out.println("\n4. Решение на основании 8 бит.");
        int decimal = 234;
        int bin = 0;
        int binReverse = 0;

        //умножение на 10 и последующее прибавление остатка к int
        while (decimal > 0) {
            bin = bin * 10;
            bin = bin + decimal%2;
            decimal = decimal/2;
        }
        //в итоге получается число без нуля, добавляется благодаря циклу. Делает реверс bin
        for (int i = 0; i < 8; i++) {
            binReverse = binReverse * 10;
            binReverse = binReverse + bin%10;
            bin = bin/10;
        }
        System.out.println(binReverse);
    }
}