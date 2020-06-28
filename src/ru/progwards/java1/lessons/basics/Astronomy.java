package ru.progwards.java1.lessons.basics;

import com.sun.jdi.DoubleValue;

public class Astronomy {
// 2.1 функция, которая вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2.
    public static Double sphereSquare(Double r){
        final double n1 = 3.14;
        final int in1 = 4;
         double n2 =  in1 * n1 * r * r;
        System.out.println(n2);
        return n2;

    }
//    2.2 ф., которая вычисляет площадь поверхности Земли, считая радиус равным 6 371.2 км и используют функцию sphereSquare
     public static Double earthSquare() {
final double d = 6371.2;
final double d1 = sphereSquare(d);
Double q1 = d1;
         System.out.println(d1);
        return d1;


    }
//2. 3 которая вычисляет площадь поверхности Меркурия, считая радиус равным 2 439,7 км  и используют функцию sphereSquare
    public static Double mercurySquare() {
        final double f =  2439.7;
         final double f1 = sphereSquare(f);
        Double f2 = Double.valueOf(f1);
        System.out.println(f2);
        return f2;
    }
//2.4 которая вычисляет площадь поверхности Юпитера, считая радиус равным 71 492 км
    public static Double jupiterSquare() {
         final double g =  71492;
        final double g1 = sphereSquare(g);
        System.out.println(g1);
        return g1;
    }
// 2.5 которая вычисляет отношение площади поверхности Земли к площади поверхности Меркурия используя готовые функции площадей планет
    public static Double earthVsMercury(){
double result = earthSquare();
double result2 = mercurySquare();
double result3 = result/result2;
        System.out.println(result3);
return result3;
    }


    public static Double earthVsJupiter() {
        double h1 = earthSquare() / jupiterSquare();
        System.out.println(h1);
        return h1;
    }
    public static void main (String[] args) {
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();

    }

   }


