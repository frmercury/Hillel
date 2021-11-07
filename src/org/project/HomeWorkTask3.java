package org.project;

import java.util.Scanner;

public class HomeWorkTask3 {

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Введите массу в фунтах:");
        double Weight = inScanner.nextInt()*0.45359237;

        System.out.println("Введите рост в дюймах:");

        double Height = inScanner.nextInt()*0.0254;

        double BMI = Weight/Math.pow(Height,2);

        System.out.println("Ваш индекс BMI состовляет " + BMI);
    }
}