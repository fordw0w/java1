package ru.progwards.java1.lessons.compare_if_cycles;

import org.w3c.dom.ls.LSOutput;

public class TriangleInfo {
    //    которая возвращает true, если по данным трём сторонам (a, b, c) можно построить треугольник.
//    Из геометрии известно, что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.
//     (c < a +b)
    public static boolean isTriangle(int a, int b, int c) {
        if ((a < b + c) & (b < a + c) & (c < a + b))
            return true;
        return false;
    }

    //    которая возвращает true, если треугольник со сторонами a, b, c является прямоугольным.
//    Из геометрии известно, что для прямоугольного треугольника выполняется теорема
//    Пифагора(сумма квадратов катетов равна квадрату гипотенузы).
//    c^2 = a^2 + b^2
    //  ac & ab - kateti; bc - gipotenuza
    // bc^2 -  ac^2 + ab^2
//    a2= b2 +c2
//    например а - большая сторона, в и с - две другие
//    находишь а^2 и b^2+c^2
//    c * c = a * a + b * b
//    a * a = c * c + b * b
//    b * b = c * c + a * a
    public static boolean isRightTriangle(int a, int b, int c) {
        int a1 = (b * b) + (c * c);
        int a2 = a * a;
        if (((a * a) + (b * b) == (c * c)) & ((c * c) + (b * b) == (a * a)) & ((c * c) + (a * a) == (b * b))) {
            return true;
        } else {
            return false;
        }


    }
//    которая возвращает true, если треугольник со сторонами a, b, c является равнобедренным.
//    Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны.
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b | a == c | b == a | b == c | c == a | c == b)
            return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isIsoscelesTriangle(23, 23, 12));
        System.out.println(isRightTriangle(3, 3, 5));
    }
}