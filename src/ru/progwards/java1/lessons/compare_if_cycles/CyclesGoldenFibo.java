package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    //    которая будет возвращать true, если число number содержит цифру digit.
    public static boolean containsDigit(int number, int digit) {
        if (number == digit)
            return true;
        int q1 = 10;
        int q2= 10;
        int q3 = number % 10;

 if ( number >= 0) {
        while (q1 <= number) {

            int q = (q1 * q2);
            int ww = number/q;
            int ww2 = ww%10;
            q1 = q;

            int hh = number%100; // 34
            int hhh = hh%10; // 4
            int hhhh= hh/10; //3
//            System.out.println(q);
//            первое число  ( тут 0)
//            System.out.println(ww);
//            System.out.println(ww3);
//            System.out.println(hhh); последнее число
//            System.out.println(hhhh); предпоследнее

            if (ww > 0 & digit == ww2 | digit == hhh | digit == hhhh)
                return true;
        }
        }
        return false;

//// МНЕ ЗА ЭТУ РАЗРАБОТКУ ТАКУЮ ПРЕМИЮ ДАДУУТ..
//
//        int a1 = number % 10;
//        int a2 = number / 10;
//        int a3 = a2 % 10;
//        int a4 = number / 100;
//        int a5 = number / 1000;
//        int a6 = a4 % 10;
//        int a7 = number / 10000;
//        int a8 = a5 % 10;
//        int a9 = number / 100000;
//        int a10 = a7 % 10;
//        int a11 = number / 1000000;
//        int a12 = a9 % 10;
//        int a13 = number / 10000000;
//        int a14 = a11 % 10;
//        int a15 = number / 100000000;
//        int a16 = a13 % 10;
//        int a17 = number / 1000000000;
//        int a18 = a15 % 10;
//
//        if (number <= 9 && number == digit)
//            return true;
//        else if ((number <= 99) && (a1 == digit) | (a2 == digit))
//            return true;
//        else if ((number <= 999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit))
//            return true;
//        else if ((number <= 9999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit))
//            return true;
//        else if ((number <= 99999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit))
//            return true;
//        else if ((number <= 999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit))
//            return true;
//        else if ((number <= 9999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit))
//            return true;
//        else if ((number <= 99999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit) | (a13 == digit) | (a14 == digit))
//            return true;
//        else if ((number <= 999999999) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit) | (a13 == digit) | (a14 == digit) | (a15 == digit) | (a16 == digit))
//            return true;
//        else if ((number <= 2147483646) && (a4 == digit) | (a2 == digit) | (a3 == digit) | (a1 == digit) | (a5 == digit) | (a6 == digit) | (a7 == digit) | (a8 == digit) | (a9 == digit) | (a10 == digit) | (a11 == digit) | (a12 == digit) | (a13 == digit) | (a14 == digit) | (a15 == digit) | (a16 == digit) | (a17 == digit) | (a18 == digit))
//            return true;
//        else
//        return false;
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
//            int n4 = n2 + n3; // как будет вести счет цикл
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
            float reb = f2 / f1;
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



    public static void main(String[] args) {
//        System.out.println(containsDigit(1234, 4));
//        System.out.println(isGoldenTriangle(233, 377, 377));
//        for (int i = 3; i <= 15; i++) {
//            System.out.println(fiboNumber(i));
//        }
        System.out.println(containsDigit(152342,2));
//        int number= 12364364;
//        int digit = 2;
//        int q1 = 10;
//        int q2= 10;
//        int q3 = number % 10;
//
//
//       while (q1 <= 999999999) {
//
//           int q = (q1 * q2);
//           int ww = number/q;
//           int ww2 = ww%10;
//           int ww3 = ww%100;
//            q1=q;
//        int hh = number%100; // 34
//        int hhh = hh%10; // 4
//        int hhhh= hh/10;
//           System.out.println(ww2);
//if (digit == ww2 | digit == hh | digit == hhhh)
//           System.out.println("есть " + ww2);
////
////
////
//        }
//        int number = 1234;
//        System.out.println(1234%100);
//        int hh = number%100; // 34
//        int hhh = hh%10; // 4
//        int hhhh= hh/10;
//        System.out.println(number);
//        System.out.println(hh);
//        System.out.println(hhh);
//        System.out.println(hhhh);
//        System.out.println(isGoldenTriangle(3, 3, 5));
//        System.out.println(isGoldenTriangle(8, 13, 8));
//        System.out.println(isGoldenTriangle(34, 55, 34));
//        System.out.println(containsDigit(5621, 2));


    }
}

