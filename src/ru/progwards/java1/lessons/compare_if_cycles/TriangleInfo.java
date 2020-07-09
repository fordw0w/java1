package ru.progwards.java1.lessons.compare_if_cycles;

import org.w3c.dom.ls.LSOutput;

public class TriangleInfo {
    //    которая возвращает true, если по данным трём сторонам (a, b, c) можно построить треугольник.
//    Из геометрии известно, что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.

    public static boolean isTriangle(int a, int b, int c) {
        if ((a < b + c) & (b < a + c) & (c < a + b))
            return true;
        return false;
    }

    public static boolean isRightTriangle(int a, int b, int c) {

        if (((c * c) == (a * a) + (b * b)) || ((a * a) == (c * c) + (b * b)) || ((b * b) == (c * c) + (a * a)))
            return true;
        else
            return false;
    }

//    которая возвращает true, если треугольник со сторонами a, b, c является равнобедренным.
//    Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны.
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b | a == c | b == a | b == c | c == a | c == b)
            return true;
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isRightTriangle(21, 34, 39));
    }
}