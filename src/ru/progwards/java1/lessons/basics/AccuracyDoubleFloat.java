package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        final double d1 = 4;
        final double d2 = 3 * 3.14;
        final double d3 = radius * radius * radius;
        final double d4 = d1 / d2 * d3;
        System.out.println(d4);
        return d4;


    }

    public static float volumeBallFloat(float radius) {
        final float f1 = 4;
        final float f2 = 3 * 3.14f;
        final float f3 = radius * radius * radius;
        final float f4 = f1 / f2 * f3;
        System.out.println(f4);
        return f4;
    }
    public static double calculateAccuracy(double radius) {
       double d1=  volumeBallDouble(6371.2);
       float f2 = volumeBallFloat(6371.2f);
       double f3 = d1 - f2;
        System.out.println(f3);
return f3;
    }

    public static void main(String[] args) {
        volumeBallDouble(1);
        volumeBallFloat(1);
        calculateAccuracy(1);
    }
}