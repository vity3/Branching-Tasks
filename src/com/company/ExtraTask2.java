package com.company;

public class ExtraTask2 {
    public static void main(String[] args) {
        toMilesPerHour(80.70);
    }

    public static void toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = Math.round(kilometersPerHour / 1.609344);
        if (kilometersPerHour < 0) {
            System.out.println(-1);
        } else {
            System.out.println("Speed in miles per hour: " + milesPerHour);
        }
    }
}