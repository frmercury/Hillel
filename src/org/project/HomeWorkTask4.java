package org.project;

public class HomeWorkTask4 {

    public static void main(String[] args) {
        double Distance = 2500;
        double Hours = 5;
        double Minutes = 56;
        double Seconds = 23;
        double DistanceInKm = Distance/1000;                            //Дистанция в км
        double TimeInSeconds = (Hours*3600) + (Minutes*60) + Seconds;   //Время в с
        double TimeInHours = TimeInSeconds/3600;                        //Время в ч

        double SpeedM = Distance/TimeInSeconds;                         //Скорость м/с
        double SpeedKm = DistanceInKm/TimeInHours;                      //Скорость км/ч

        System.out.println("Your speed in meters/second is " + SpeedM);
        System.out.println("Your speed in km/ is " + SpeedKm);
    }
}