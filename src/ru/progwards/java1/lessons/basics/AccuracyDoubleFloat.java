package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    // 4/3πR3
    public static double volumeBallDouble(double radius) {
        final double d1 = 4;
        final double d2 = d1 / 3 * 3.14 * radius * radius * radius;
        System.out.println(d2);
        return d2;


    }

    public static float volumeBallFloat(float radius) {

        final float f1 = 4;
        final float f3 = 3.14f;
        final float f2 = f1 / 3 * f3 * radius * radius * radius;
        System.out.println(f2);
        return f2;
    }
    public static double calculateAccuracy(double radius) {

       double d1= volumeBallDouble( 6371.2);
       float f2 = volumeBallFloat(6371.2f);
       float f3 = (float) d1 - f2;
        System.out.println(f3);
return f3;
    }

    public static void main(String[] args) {
        volumeBallDouble(1);
        volumeBallFloat(1);
        calculateAccuracy(1);

    }
}