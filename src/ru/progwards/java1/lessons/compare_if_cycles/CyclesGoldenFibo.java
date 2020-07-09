package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    //    которая будет возвращать true, если число number содержит цифру digit.
    public static boolean containsDigit(int number, int digit) {
        if (number == digit)
            return true;
        int q1 = 10;
        int q2= 10;

 if ( number >= 0) {
        while (q1 <= number) {
            int q = (q1 * q2);
            int ww = number/q; // первое число (0)
            int ww2 = ww%10;
            q1 = q;
            int hh = number%100; // 34
            int hhh = hh%10; // последнее число
            int hhhh= hh/10; // предпоследнее число
            if (ww > 0 & digit == ww2 | digit == hhh | digit == hhhh)
                return true;
        }
        }
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
            a3 = a1 + a2; // формула по которой считает цикл
            a1 = a2; // значения который будут меняться и подставляться в формулу
            a2 = a3;
        }
        return a3;

    }

    //  которая будет возвращать true, если треугольник со сторонами a, b, c является Золотым
// Золотой треугольник это равнобедренный треугольник
    public static boolean isGoldenTriangle(int a, int b, int c) {
          if (a == b) {
            System.out.println(" a = b значит ребро " + a + " и " + b + " следовательно с - основание = " + c);
            int rebro = a;
            int osn = c;
            float frebro = (float) rebro;
            float fosn = (float) osn;
//            float osnovanieC = fosn / frebro;
              float osnovanieC = frebro / fosn;

            System.out.println(" делим ребро на основание получаем " + osnovanieC);
            if (osnovanieC >= 1.61703 && osnovanieC < 1.61903)
                return true;
        } else if (a == c) {
            System.out.println(" a = c значит ребро " + a + " и " + c + " следовательно с - основание = " + b);
            int rebro1 = a;
            int osn1 = b;
            float frebro1 = (float) rebro1;
            float fosn1 = (float) osn1;
//            float osnovanieC1 = fosn1 / frebro1;
              float osnovanieC1 = frebro1 / fosn1;
            System.out.println(" делим ребро на основание получаем " + osnovanieC1);
            if (osnovanieC1 >= 1.61703 && osnovanieC1 < 1.61903)
                return true;
        } else if (b == c) {
            System.out.println(" b = c значит ребро " + b + " и " + c + " следовательно с - основание = " + a);
            int rebro2 = b;
            int osn2 = a;
            float frebro2 = (float) rebro2;
            float fosn2 = (float) osn2;
//            float osnovanieC2 = fosn2 / frebro2;
            float osnovanieC2 = frebro2 / fosn2;
            System.out.println(" делим ребро на основание получаем " + osnovanieC2);
            if (osnovanieC2 >= 1.61703 && osnovanieC2 < 1.61903)
                return true;
        } else ;
        return false;
    }



    public static void main(String[] args) {
        for (int i = 2; i <= 15; i++) {
            System.out.println(fiboNumber(i));
        }
        int a1 = 0;
        int a2 = 0;
        for (int i = 1; i <= 10; i++) {
    a1 = fiboNumber(i);
    a2 = fiboNumber(++i);
    if (isGoldenTriangle(a2,a2,a1))
        System.out.println(isGoldenTriangle(a2,a2,a1));

//    System.out.println(isGoldenTriangle(a2,a2,a1));
}
    }
}

