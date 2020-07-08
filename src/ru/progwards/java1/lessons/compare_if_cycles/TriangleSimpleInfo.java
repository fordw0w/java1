package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    //    которая получает параметрами длины сторон треугольника, а вернуть должна наибольшую длину стороны.
    public static int maxSide(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
         else return c;
//             (c > a && c > b)

    }
//    которая получает параметрами длины сторон треугольника, а вернуть должна наименьшую длину стороны.
        public static int minSide ( int a, int b, int c){
            if (a <= b && a <= c)
                return a;
            else if (b <= a && b <= c)
                return b;
            else
//             (c < a && c < b) ;
            return c;
        }
//    которая получает параметрами длины сторон треугольника, а вернуть должна true, если треугольник равносторонний и false в противном случае.
        public static boolean isEquilateralTriangle ( int a, int b, int c){
            if (a == b && b == c)
                return true;
            return false;
        }

        public static void main (String[]args){
            System.out.println(maxSide(10, 11, 12));
            System.out.println(minSide(13, 11, 11));
            System.out.println(isEquilateralTriangle(15, 15, 15));
        }
    }
