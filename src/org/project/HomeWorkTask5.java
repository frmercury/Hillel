package org.project;

import java.util.Scanner;

public class HomeWorkTask5 {

    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Введите начальное значение диапазона:");
        int Min = inScanner.nextInt();
        System.out.println("Введите конечное значение диапазона:");
        int Max = inScanner.nextInt();


        int Random = Min + (int) (Math.random()*((Max-Min)+1));   //Если выражение Math.random() = 0, то выведется значение минимального диапазона.
                                                                // "+1" - Math.random() генерирует от 0 до 0.9999..., и максимального диапазона не получится, поэтому прибаляю 1
        System.out.println("Cлучайное целое число в диапазоне от " + Min + " до " + Max + " составляет: " + Random);

    }
}
