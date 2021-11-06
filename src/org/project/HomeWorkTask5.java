package org.project;

public class HomeWorkTask5 {

    public static void main(String[] args) {

        int a = 0;   // Начальное значение диапазона
        int b = 50;  // Конечное значение диапазона

        int Random = a + (int) (Math.random()*b);
        double Random1 = a + (Math.random()*b);
        System.out.println("Cлучайное целое число в диапазоне от 0 до 50 " + Random);
        System.out.println("Cлучайное дробное число в диапазоне от 0 до 50 " + Random1);
    }
}
