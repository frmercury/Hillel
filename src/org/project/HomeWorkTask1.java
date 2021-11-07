package org.project;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Please enter a number in inches?");
        int Inch = inScanner.nextInt();
        double InchMeterConverter = Inch*0.0254;
        System.out.println("Расстояние в метрах состовляет " + InchMeterConverter);
    }
}