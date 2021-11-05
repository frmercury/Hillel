package org.project;

import java.util.Scanner;

public class Classwork {

    public static void main(String[] args) {
       Scanner inScanner = new Scanner(System.in);
//       System.out.println("Год рождения друга?");
//       int birthYear = inScanner.nextInt();
//
//       System.out.println("Мой друг родился в "  + (birthYear - 8) + " году");

        int a;
        int b;
        int c;
        int t;
        a = 3;
        b = 3;
        c = 3;
        t = 90;

        System.out.println("Перевод в минуты "  + a*60);

        // Либо, если часы - не целое число

        System.out.println("Введите часы");
        int hour = inScanner.nextInt();
        System.out.println("Введите минуты");
        int minutes = inScanner.nextInt();

        System.out.println("Время в минутах "  + (hour*60 + minutes));

        System.out.println("Площадь треугольника = " + a*b/2 + " m2");

        System.out.println("Среднее арифметическое a2+b2+c2 = " + ((Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2))/2));

        System.out.println("t в Цельсиях = " + (t - 32)*5/9);

        System.out.println("t в Кельвинах = " + (t + 273.15));

    }
}