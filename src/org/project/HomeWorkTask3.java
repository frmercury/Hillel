package org.project;

public class HomeWorkTask3 {

    public static void main(String[] args) {
        double Weight = 452;
        double Height = 72;
        double BMI = (Weight/Math.pow(Height,2)*703);
        System.out.println("Ваш индекс BMI состовляет " + BMI);
    }
}
