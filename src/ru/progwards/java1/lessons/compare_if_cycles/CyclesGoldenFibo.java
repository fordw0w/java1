package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    //    которая будет возвращать true, если число number содержит цифру digit.
    public static boolean containsDigit(int number, int digit) {

// МНЕ ЗА ЭТУ РАЗРАБОТКУ ТАКУЮ ПРЕМИЮ ДАДУУТ..
        int a1 = number % 10;
        int a2 = number / 10;
        int a3 = a2 % 10;
        int a4 = number / 100;
        int a5 = number / 1000;
        int a6 = a4 % 10;
        int a7 = number / 10000;
        int a8 = a5 % 10;
        int a9 = number / 100000;
        int a10 = a7 % 10;
        int a11 = number / 1000000;
        int a12 = a9 % 10;
        int a13 = number / 10000000;
        int a14 = a11 % 10;
        int a15 = number / 100000000;
        int a16 = a13 % 10;
        int a17 = number / 1000000000;
        int a18 = a15 % 10;

        if (number <= 9 && number == digit)
            return true;
        if ((number <= 99) && (a1 == digit) | (a2 == digit))
            return true;
        if ((number <= 999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit))
            return true;
        if ((number <= 9999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit))
            return true;
        if ((number <= 99999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit))
            return true;
        if ((number <= 999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit))
            return true;
        if ((number <= 9999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit))
            return true;
        if ((number <= 99999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit) | (a13 == digit) | (a14 == digit))
            return true;
        if ((number <= 999999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit) | (a13 == digit) | (a14 == digit) | (a15 == digit) | (a16 == digit))
            return true;
        if ((number <= 2147483646) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit) | (a13 == digit) | (a14 == digit) | (a15 == digit) | (a16 == digit) | (a17 == digit) | (a18 == digit))
            return true;
        return false;
    }

    public static int fiboNumber(int n) {
//        которая будет возвращать n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).
//         1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
        if (n <= 2)
            return 1;
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;
        for (int i = 3; i <= n; i++) {
//            int n1 = a1 + a2;
//            int n2 = n1 + a2;
//            int n3 = n2 + n1;
//            int n4 = n2 + n3; // как будет считать цикл
//            int n5 = n3 + n4;
//            int n6 = n4 + n5;
//            int n7 = n5 + n6;
//            int n8 = n6 + n7;
            a3 = a1 + a2; // формула по которой считает цикл
            a1 = a2; // значения который будут меняться и подставляться в формулу
            a2 = a3;
        }
        return a3;

    }

    //  которая будет возвращать true, если треугольник со сторонами a, b, c является Золотым
// Золотой треугольник это равнобедренный треугольник
    public static boolean isGoldenTriangle(int a, int b, int c) {
//        if (TriangleInfo.isIsoscelesTriangle(a, b, c)) {
//            System.out.println(TriangleInfo.isIsoscelesTriangle(a, b, c));
            int max = TriangleSimpleInfo.maxSide(a, b, c);
            int min = TriangleSimpleInfo.minSide(a, b, c);
            float f1 = (float) max;
            float f2 = (float) min;
            float reb = f1 / f2;
            int rebi = (int) reb;
            System.out.println(TriangleSimpleInfo.maxSide(a, b, c) + " - Основание");
            System.out.println(TriangleSimpleInfo.minSide(a, b, c) + " - Ребро");
            System.out.println("Золотое сечение этого треугольника в float значении = " + reb);
            System.out.println("Золотое сечение этого треугольника в int значении = " + rebi);
         if (reb >= 1.61703 && reb <1.61903) {
             return true;
         } else
             return false;

    }
//if isIsoscelesTriangle
//                to maxSide - находим большее значение
//                это значение - основание
//                находим ребра minSide
//                ребро : ребро = ребро : основание
//                1 = 0.6
//                        1++  - 1.6
//                                если 1.6 то ture


    public static void main(String[] args) {
        System.out.println(containsDigit(523, 2));
        System.out.println(isGoldenTriangle(55, 55, 89));
        for (int i = 3; i <= 15; i++) {
            System.out.println(fiboNumber(i));
            System.out.println(isGoldenTriangle(i, i, i));
        }


//        int a = 3;
//        int b = 2;
//        int c = 2;
////        boolean res1 == a >= 0;
////        boolean res2 = (b >= 1 && b < 100);
////        boolean res3 = (c >= 1 && c < 100);
//
//        if ((a >= 1 && a < 100) && (b >= 1 && b < 100) && (c >= 1 && c < 100)) {
//            TriangleInfo.isTriangle(a, b, c);
//            System.out.println("Если это натурально число, проверяем треугольник ли это");
//        } else if (TriangleInfo.isTriangle(a, b, c)) {
//            TriangleInfo.isIsoscelesTriangle(a, b, c);
//            System.out.println("Проверяем, Равнобедренный ли треугольник");
//        } else if (TriangleInfo.isIsoscelesTriangle(a, b, c)) {
//            TriangleSimpleInfo.isEquilateralTriangle(a, b, c);
//            System.out.println("Проверяем равносторонний ли");
//        } else if (TriangleSimpleInfo.isEquilateralTriangle(a, b, c)) {
//            TriangleSimpleInfo.minSide(a, b, c);
//            TriangleSimpleInfo.maxSide(a, b, c);
//            System.out.println("получаем основание треугольника = ");
//            System.out.print(TriangleSimpleInfo.minSide(a, b, c));
//            System.out.println("Получаем ребра треугольника = ");
//            System.out.println(TriangleSimpleInfo.maxSide(a, b, c));
//        } else {
//
//            System.out.println("Числа не подходят");
//        }




        //if  natur chislo
//to isTriangle(int a, int b, int c)
//if  isTriangle true
// pereminie kidaem v (ravnobedren)  isIsoscelesTriangle
//if  isIsoscelesTriangle true
//to peremenie kidaev v  isEquilateralTriangle
//if isEquilateralTriangle true
//to kidem peremenie v  minSide(int a, int b, int ) - osnovanie treugolnika
//        vivodim chislo minSide - osnovanie treugolnika
//        maxSide - rebra treugolnika
//        vivodim na konsole max rebra min osnovanie
//end


//        }
//    }
    }
}

