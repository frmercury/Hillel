package org.project;

public class HomeWorkTask2 {
    public static void main(String[] args) {
       int TotalMinutes = 3456789;                             // Исходное количество минут
       int MinutesInYear = 525600;                             // Количество минут в одном году
       int Years = TotalMinutes / MinutesInYear;               // Находим количество лет
       int Days = (TotalMinutes %= MinutesInYear)/1440;        // Берем остаток и переводим в дни

       System.out.println(Years + " лет " + Days + " дней");
    }
}
